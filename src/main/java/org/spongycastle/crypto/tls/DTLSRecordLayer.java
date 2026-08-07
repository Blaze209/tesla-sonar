package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
class DTLSRecordLayer implements DatagramTransport {
    private static final int MAX_FRAGMENT_LENGTH = 16384;
    private static final int RECORD_HEADER_LENGTH = 13;
    private static final long RETRANSMIT_TIMEOUT = 240000;
    private static final long TCP_MSL = 120000;
    private final TlsContext context;
    private DTLSEpoch currentEpoch;
    private final TlsPeer peer;
    private DTLSEpoch pendingEpoch;
    private volatile int plaintextLimit;
    private DTLSEpoch readEpoch;
    private final DatagramTransport transport;
    private DTLSEpoch writeEpoch;
    private final ByteQueue recordQueue = new ByteQueue();
    private volatile boolean closed = false;
    private volatile boolean failed = false;
    private volatile ProtocolVersion readVersion = null;
    private volatile ProtocolVersion writeVersion = null;
    private DTLSHandshakeRetransmit retransmit = null;
    private DTLSEpoch retransmitEpoch = null;
    private long retransmitExpiry = 0;
    private volatile boolean inHandshake = true;

    DTLSRecordLayer(DatagramTransport datagramTransport, TlsContext tlsContext, TlsPeer tlsPeer, short s11) {
        this.transport = datagramTransport;
        this.context = tlsContext;
        this.peer = tlsPeer;
        DTLSEpoch dTLSEpoch = new DTLSEpoch(0, new TlsNullCipher(tlsContext));
        this.currentEpoch = dTLSEpoch;
        this.pendingEpoch = null;
        this.readEpoch = dTLSEpoch;
        this.writeEpoch = dTLSEpoch;
        setPlaintextLimit(16384);
    }

    private void closeTransport() {
        if (this.closed) {
            return;
        }
        try {
            if (!this.failed) {
                warn((short) 0, null);
            }
            this.transport.close();
        } catch (Exception unused) {
        }
        this.closed = true;
    }

    private static long getMacSequenceNumber(int i11, long j11) {
        return ((((long) i11) & 4294967295L) << 48) | j11;
    }

    private void raiseAlert(short s11, short s12, String str, Throwable th2) throws TlsFatalAlert {
        this.peer.notifyAlertRaised(s11, s12, str, th2);
        sendRecord((short) 21, new byte[]{(byte) s11, (byte) s12}, 0, 2);
    }

    private int receiveRecord(byte[] bArr, int i11, int i12, int i13) {
        int uint16;
        int uint17;
        if (this.recordQueue.available() <= 0) {
            int iReceive = this.transport.receive(bArr, i11, i12, i13);
            if (iReceive < 13 || iReceive <= (uint16 = TlsUtils.readUint16(bArr, i11 + 11) + 13)) {
                return iReceive;
            }
            this.recordQueue.addData(bArr, i11 + uint16, iReceive - uint16);
            return uint16;
        }
        if (this.recordQueue.available() >= 13) {
            byte[] bArr2 = new byte[2];
            this.recordQueue.read(bArr2, 0, 2, 11);
            uint17 = TlsUtils.readUint16(bArr2, 0);
        } else {
            uint17 = 0;
        }
        int iMin = Math.min(this.recordQueue.available(), uint17 + 13);
        this.recordQueue.removeData(bArr, i11, iMin, 0);
        return iMin;
    }

    private void sendRecord(short s11, byte[] bArr, int i11, int i12) throws TlsFatalAlert {
        if (this.writeVersion == null) {
            return;
        }
        if (i12 > this.plaintextLimit) {
            throw new TlsFatalAlert((short) 80);
        }
        if (i12 < 1 && s11 != 23) {
            throw new TlsFatalAlert((short) 80);
        }
        int epoch = this.writeEpoch.getEpoch();
        long jAllocateSequenceNumber = this.writeEpoch.allocateSequenceNumber();
        byte[] bArrEncodePlaintext = this.writeEpoch.getCipher().encodePlaintext(getMacSequenceNumber(epoch, jAllocateSequenceNumber), s11, bArr, i11, i12);
        int length = bArrEncodePlaintext.length + 13;
        byte[] bArr2 = new byte[length];
        TlsUtils.writeUint8(s11, bArr2, 0);
        TlsUtils.writeVersion(this.writeVersion, bArr2, 1);
        TlsUtils.writeUint16(epoch, bArr2, 3);
        TlsUtils.writeUint48(jAllocateSequenceNumber, bArr2, 5);
        TlsUtils.writeUint16(bArrEncodePlaintext.length, bArr2, 11);
        System.arraycopy(bArrEncodePlaintext, 0, bArr2, 13, bArrEncodePlaintext.length);
        this.transport.send(bArr2, 0, length);
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void close() throws TlsFatalAlert {
        if (this.closed) {
            return;
        }
        if (this.inHandshake) {
            warn((short) 90, "User canceled handshake");
        }
        closeTransport();
    }

    void fail(short s11) {
        if (this.closed) {
            return;
        }
        try {
            raiseAlert((short) 2, s11, null, null);
        } catch (Exception unused) {
        }
        this.failed = true;
        closeTransport();
    }

    void failed() {
        if (this.closed) {
            return;
        }
        this.failed = true;
        closeTransport();
    }

    ProtocolVersion getReadVersion() {
        return this.readVersion;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getReceiveLimit() {
        return Math.min(this.plaintextLimit, this.readEpoch.getCipher().getPlaintextLimit(this.transport.getReceiveLimit() - 13));
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getSendLimit() {
        return Math.min(this.plaintextLimit, this.writeEpoch.getCipher().getPlaintextLimit(this.transport.getSendLimit() - 13));
    }

    void handshakeSuccessful(DTLSHandshakeRetransmit dTLSHandshakeRetransmit) {
        DTLSEpoch dTLSEpoch = this.readEpoch;
        DTLSEpoch dTLSEpoch2 = this.currentEpoch;
        if (dTLSEpoch == dTLSEpoch2 || this.writeEpoch == dTLSEpoch2) {
            throw new IllegalStateException();
        }
        if (dTLSHandshakeRetransmit != null) {
            this.retransmit = dTLSHandshakeRetransmit;
            this.retransmitEpoch = dTLSEpoch2;
            this.retransmitExpiry = System.currentTimeMillis() + RETRANSMIT_TIMEOUT;
        }
        this.inHandshake = false;
        this.currentEpoch = this.pendingEpoch;
        this.pendingEpoch = null;
    }

    void initPendingEpoch(TlsCipher tlsCipher) {
        if (this.pendingEpoch != null) {
            throw new IllegalStateException();
        }
        this.pendingEpoch = new DTLSEpoch(this.writeEpoch.getEpoch() + 1, tlsCipher);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x003a A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:62:0x00df  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x0105  */
    /* JADX WARN: Code duplicated, block: B:76:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x011e  */
    /* JADX WARN: Code duplicated, block: B:82:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0134  */
    /* JADX WARN: Code duplicated, block: B:94:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.spongycastle.crypto.tls.DTLSEpoch, org.spongycastle.crypto.tls.DTLSHandshakeRetransmit] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int receive(byte[] bArr, int i11, int i12, int i13) throws TlsFatalAlert {
        DTLSEpoch dTLSEpoch;
        DTLSEpoch dTLSEpoch2;
        DTLSEpoch dTLSEpoch3;
        long uint48;
        ProtocolVersion version;
        byte[] bArrDecodeCiphertext;
        int i14;
        DTLSEpoch dTLSEpoch4;
        short s11;
        short s12;
        DTLSHandshakeRetransmit dTLSHandshakeRetransmit;
        ?? r11 = 0;
        byte[] bArr2 = null;
        while (true) {
            int iMin = Math.min(i12, getReceiveLimit()) + 13;
            if (bArr2 == null || bArr2.length < iMin) {
                bArr2 = new byte[iMin];
            }
            byte[] bArr3 = bArr2;
            if (this.retransmit != null && System.currentTimeMillis() > this.retransmitExpiry) {
                this.retransmit = r11;
                this.retransmitEpoch = r11;
            }
            int iReceiveRecord = receiveRecord(bArr3, 0, iMin, i13);
            if (iReceiveRecord < 0) {
                return iReceiveRecord;
            }
            if (iReceiveRecord >= 13 && iReceiveRecord == TlsUtils.readUint16(bArr3, 11) + 13) {
                short uint8 = TlsUtils.readUint8(bArr3, 0);
                switch (uint8) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        int uint16 = TlsUtils.readUint16(bArr3, 3);
                        if (uint16 != this.readEpoch.getEpoch()) {
                            if (uint8 == 22 && (dTLSEpoch2 = this.retransmitEpoch) != null && uint16 == dTLSEpoch2.getEpoch()) {
                                dTLSEpoch3 = this.retransmitEpoch;
                            } else {
                                dTLSEpoch = r11;
                            }
                            if (dTLSEpoch == 0) {
                                uint48 = TlsUtils.readUint48(bArr3, 5);
                                if (dTLSEpoch.getReplayWindow().shouldDiscard(uint48)) {
                                    version = TlsUtils.readVersion(bArr3, 1);
                                    if (version.isDTLS() && (this.readVersion == null || this.readVersion.equals(version))) {
                                        bArrDecodeCiphertext = dTLSEpoch.getCipher().decodeCiphertext(getMacSequenceNumber(dTLSEpoch.getEpoch(), uint48), uint8, bArr3, 13, iReceiveRecord - 13);
                                        dTLSEpoch.getReplayWindow().reportAuthenticated(uint48);
                                        if (bArrDecodeCiphertext.length <= this.plaintextLimit) {
                                            r11 = 0;
                                            break;
                                        } else {
                                            if (this.readVersion == null) {
                                                this.readVersion = version;
                                            }
                                            switch (uint8) {
                                                case 20:
                                                    r11 = 0;
                                                    for (i14 = 0; i14 < bArrDecodeCiphertext.length; i14++) {
                                                        if (TlsUtils.readUint8(bArrDecodeCiphertext, i14) == 1 && (dTLSEpoch4 = this.pendingEpoch) != null) {
                                                            this.readEpoch = dTLSEpoch4;
                                                        }
                                                    }
                                                    break;
                                                case 21:
                                                    r11 = 0;
                                                    r11 = 0;
                                                    r11 = 0;
                                                    if (bArrDecodeCiphertext.length == 2) {
                                                        s11 = bArrDecodeCiphertext[0];
                                                        s12 = bArrDecodeCiphertext[1];
                                                        this.peer.notifyAlertReceived(s11, s12);
                                                        if (s11 != 2) {
                                                            failed();
                                                            throw new TlsFatalAlert(s12);
                                                        }
                                                        if (s12 == 0) {
                                                            closeTransport();
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                    break;
                                                case 22:
                                                    if (!this.inHandshake) {
                                                        dTLSHandshakeRetransmit = this.retransmit;
                                                        if (dTLSHandshakeRetransmit != null) {
                                                            dTLSHandshakeRetransmit.receivedHandshakeRecord(uint16, bArrDecodeCiphertext, 0, bArrDecodeCiphertext.length);
                                                        }
                                                        r11 = 0;
                                                    }
                                                    break;
                                                case 23:
                                                    if (!this.inHandshake) {
                                                    }
                                                    r11 = 0;
                                                    break;
                                                case 24:
                                                    r11 = 0;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            dTLSEpoch3 = this.readEpoch;
                        }
                        dTLSEpoch = dTLSEpoch3;
                        if (dTLSEpoch == 0) {
                            uint48 = TlsUtils.readUint48(bArr3, 5);
                            if (dTLSEpoch.getReplayWindow().shouldDiscard(uint48)) {
                                version = TlsUtils.readVersion(bArr3, 1);
                                if (version.isDTLS()) {
                                    bArrDecodeCiphertext = dTLSEpoch.getCipher().decodeCiphertext(getMacSequenceNumber(dTLSEpoch.getEpoch(), uint48), uint8, bArr3, 13, iReceiveRecord - 13);
                                    dTLSEpoch.getReplayWindow().reportAuthenticated(uint48);
                                    if (bArrDecodeCiphertext.length <= this.plaintextLimit) {
                                        r11 = 0;
                                        break;
                                    } else {
                                        if (this.readVersion == null) {
                                            this.readVersion = version;
                                        }
                                        switch (uint8) {
                                            case 20:
                                                r11 = 0;
                                                while (i14 < bArrDecodeCiphertext.length) {
                                                    if (TlsUtils.readUint8(bArrDecodeCiphertext, i14) == 1) {
                                                        this.readEpoch = dTLSEpoch4;
                                                    }
                                                }
                                                break;
                                            case 21:
                                                r11 = 0;
                                                r11 = 0;
                                                r11 = 0;
                                                if (bArrDecodeCiphertext.length == 2) {
                                                    s11 = bArrDecodeCiphertext[0];
                                                    s12 = bArrDecodeCiphertext[1];
                                                    this.peer.notifyAlertReceived(s11, s12);
                                                    if (s11 != 2) {
                                                        failed();
                                                        throw new TlsFatalAlert(s12);
                                                    }
                                                    if (s12 == 0) {
                                                        closeTransport();
                                                    }
                                                } else {
                                                    continue;
                                                }
                                                break;
                                            case 22:
                                                if (!this.inHandshake) {
                                                    dTLSHandshakeRetransmit = this.retransmit;
                                                    if (dTLSHandshakeRetransmit != null) {
                                                        dTLSHandshakeRetransmit.receivedHandshakeRecord(uint16, bArrDecodeCiphertext, 0, bArrDecodeCiphertext.length);
                                                    }
                                                    r11 = 0;
                                                }
                                                break;
                                            case 23:
                                                if (!this.inHandshake) {
                                                }
                                                r11 = 0;
                                                break;
                                            case 24:
                                                r11 = 0;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    default:
                        break;
                }
            }
            bArr2 = bArr3;
            r11 = r11;
        }
        if (!this.inHandshake && this.retransmit != null) {
            this.retransmit = null;
            this.retransmitEpoch = null;
        }
        System.arraycopy(bArrDecodeCiphertext, 0, bArr, i11, bArrDecodeCiphertext.length);
        return bArrDecodeCiphertext.length;
    }

    void resetWriteEpoch() {
        DTLSEpoch dTLSEpoch = this.retransmitEpoch;
        if (dTLSEpoch != null) {
            this.writeEpoch = dTLSEpoch;
        } else {
            this.writeEpoch = this.currentEpoch;
        }
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void send(byte[] bArr, int i11, int i12) throws TlsFatalAlert {
        short s11;
        DTLSEpoch dTLSEpoch;
        if (this.inHandshake || this.writeEpoch == this.retransmitEpoch) {
            if (TlsUtils.readUint8(bArr, i11) == 20) {
                if (this.inHandshake) {
                    dTLSEpoch = this.pendingEpoch;
                } else {
                    dTLSEpoch = this.writeEpoch == this.retransmitEpoch ? this.currentEpoch : null;
                }
                if (dTLSEpoch == null) {
                    throw new IllegalStateException();
                }
                sendRecord((short) 20, new byte[]{1}, 0, 1);
                this.writeEpoch = dTLSEpoch;
            }
            s11 = 22;
        } else {
            s11 = 23;
        }
        sendRecord(s11, bArr, i11, i12);
    }

    void setPlaintextLimit(int i11) {
        this.plaintextLimit = i11;
    }

    void setReadVersion(ProtocolVersion protocolVersion) {
        this.readVersion = protocolVersion;
    }

    void setWriteVersion(ProtocolVersion protocolVersion) {
        this.writeVersion = protocolVersion;
    }

    void warn(short s11, String str) throws TlsFatalAlert {
        raiseAlert((short) 1, s11, str, null);
    }
}
