package com.google.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
abstract class BinaryReader implements Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;

    /* JADX INFO: renamed from: com.google.protobuf.BinaryReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* synthetic */ BinaryReader(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static BinaryReader newInstance(ByteBuffer byteBuffer, boolean z11) {
        if (byteBuffer.hasArray()) {
            return new SafeHeapReader(byteBuffer, z11);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public abstract int getTotalBytesRead();

    @Override // com.google.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    private static final class SafeHeapReader extends BinaryReader {
        private final byte[] buffer;
        private final boolean bufferIsImmutable;
        private int endGroupTag;
        private final int initialPos;
        private int limit;
        private int pos;
        private int tag;

        public SafeHeapReader(ByteBuffer byteBuffer, boolean z11) {
            super(null);
            this.bufferIsImmutable = z11;
            this.buffer = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.pos = iArrayOffset;
            this.initialPos = iArrayOffset;
            this.limit = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean isAtEnd() {
            return this.pos == this.limit;
        }

        private byte readByte() throws InvalidProtocolBufferException {
            int i11 = this.pos;
            if (i11 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i11 + 1;
            return bArr[i11];
        }

        private Object readField(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(readBool());
                case 2:
                    return readBytes();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(readEnum());
                case 5:
                    return Integer.valueOf(readFixed32());
                case 6:
                    return Long.valueOf(readFixed64());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(readInt32());
                case 9:
                    return Long.valueOf(readInt64());
                case 10:
                    return readMessage(cls, extensionRegistryLite);
                case 11:
                    return Integer.valueOf(readSFixed32());
                case 12:
                    return Long.valueOf(readSFixed64());
                case 13:
                    return Integer.valueOf(readSInt32());
                case 14:
                    return Long.valueOf(readSInt64());
                case 15:
                    return readStringRequireUtf8();
                case 16:
                    return Integer.valueOf(readUInt32());
                case 17:
                    return Long.valueOf(readUInt64());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private int readLittleEndian32() throws InvalidProtocolBufferException {
            requireBytes(4);
            return readLittleEndian32_NoCheck();
        }

        private int readLittleEndian32_NoCheck() {
            int i11 = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i11 + 4;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        private long readLittleEndian64() throws InvalidProtocolBufferException {
            requireBytes(8);
            return readLittleEndian64_NoCheck();
        }

        private long readLittleEndian64_NoCheck() {
            int i11 = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i11 + 8;
            return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
        }

        private int readVarint32() throws InvalidProtocolBufferException {
            int i11;
            int i12 = this.pos;
            int i13 = this.limit;
            if (i13 == i12) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.pos = i14;
                return b11;
            }
            if (i13 - i14 < 9) {
                return (int) readVarint64SlowPath();
            }
            int i15 = i12 + 2;
            int i16 = (bArr[i14] << 7) ^ b11;
            if (i16 < 0) {
                i11 = i16 ^ RangingPosition.RSSI_UNKNOWN;
            } else {
                int i17 = i12 + 3;
                int i18 = (bArr[i15] << 14) ^ i16;
                if (i18 >= 0) {
                    i11 = i18 ^ 16256;
                } else {
                    int i19 = i12 + 4;
                    int i21 = i18 ^ (bArr[i17] << 21);
                    if (i21 < 0) {
                        i11 = (-2080896) ^ i21;
                    } else {
                        i17 = i12 + 5;
                        byte b12 = bArr[i19];
                        int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                        if (b12 < 0) {
                            i19 = i12 + 6;
                            if (bArr[i17] < 0) {
                                i17 = i12 + 7;
                                if (bArr[i19] < 0) {
                                    i19 = i12 + 8;
                                    if (bArr[i17] < 0) {
                                        i17 = i12 + 9;
                                        if (bArr[i19] < 0) {
                                            int i23 = i12 + 10;
                                            if (bArr[i17] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i15 = i23;
                                            i11 = i22;
                                        }
                                    }
                                }
                            }
                            i11 = i22;
                        }
                        i11 = i22;
                    }
                    i15 = i19;
                }
                i15 = i17;
            }
            this.pos = i15;
            return i11;
        }

        private long readVarint64SlowPath() throws InvalidProtocolBufferException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                byte b11 = readByte();
                j11 |= ((long) (b11 & 127)) << i11;
                if ((b11 & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void requireBytes(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0 || i11 > this.limit - this.pos) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requirePosition(int i11) throws InvalidProtocolBufferException {
            if (this.pos != i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requireWireType(int i11) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (WireFormat.getTagWireType(this.tag) != i11) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        private void skipBytes(int i11) throws InvalidProtocolBufferException {
            requireBytes(i11);
            this.pos += i11;
        }

        private void skipGroup() throws InvalidProtocolBufferException {
            int i11 = this.endGroupTag;
            this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.tag != this.endGroupTag) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.endGroupTag = i11;
        }

        private void skipVarint() throws InvalidProtocolBufferException {
            int i11 = this.limit;
            int i12 = this.pos;
            if (i11 - i12 >= 10) {
                byte[] bArr = this.buffer;
                int i13 = 0;
                while (i13 < 10) {
                    int i14 = i12 + 1;
                    if (bArr[i12] >= 0) {
                        this.pos = i14;
                        return;
                    } else {
                        i13++;
                        i12 = i14;
                    }
                }
            }
            skipVarintSlowPath();
        }

        private void skipVarintSlowPath() throws InvalidProtocolBufferException {
            for (int i11 = 0; i11 < 10; i11++) {
                if (readByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void verifyPackedFixed32Length(int i11) throws InvalidProtocolBufferException {
            requireBytes(i11);
            if ((i11 & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        private void verifyPackedFixed64Length(int i11) throws InvalidProtocolBufferException {
            requireBytes(i11);
            if ((i11 & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // com.google.protobuf.Reader
        public int getFieldNumber() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                return Integer.MAX_VALUE;
            }
            int varint32 = readVarint32();
            this.tag = varint32;
            if (varint32 == this.endGroupTag) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.getTagFieldNumber(varint32);
        }

        @Override // com.google.protobuf.Reader
        public int getTag() {
            return this.tag;
        }

        @Override // com.google.protobuf.BinaryReader
        public int getTotalBytesRead() {
            return this.pos - this.initialPos;
        }

        @Override // com.google.protobuf.Reader
        public <T> void mergeGroupField(T t11, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) {
            int i11 = this.endGroupTag;
            this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
            try {
                schema.mergeFrom(t11, this, extensionRegistryLite);
                if (this.tag != this.endGroupTag) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                this.endGroupTag = i11;
            } catch (Throwable th2) {
                this.endGroupTag = i11;
                throw th2;
            }
        }

        @Override // com.google.protobuf.Reader
        public <T> void mergeMessageField(T t11, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int varint32 = readVarint32();
            requireBytes(varint32);
            int i11 = this.limit;
            int i12 = this.pos + varint32;
            this.limit = i12;
            try {
                schema.mergeFrom(t11, this, extensionRegistryLite);
                if (this.pos != i12) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                this.limit = i11;
            } catch (Throwable th2) {
                this.limit = i11;
                throw th2;
            }
        }

        @Override // com.google.protobuf.Reader
        public boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(0);
            return readVarint32() != 0;
        }

        @Override // com.google.protobuf.Reader
        public void readBoolList(List<Boolean> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof BooleanArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        list.add(Boolean.valueOf(readVarint32() != 0));
                    }
                    requirePosition(varint32);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(readBool()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint33 = this.pos + readVarint32();
                while (this.pos < varint33) {
                    booleanArrayList.addBoolean(readVarint32() != 0);
                }
                requirePosition(varint33);
                return;
            }
            do {
                booleanArrayList.addBoolean(readBool());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.Reader
        public ByteString readBytes() throws InvalidProtocolBufferException {
            requireWireType(2);
            int varint32 = readVarint32();
            if (varint32 == 0) {
                return ByteString.EMPTY;
            }
            requireBytes(varint32);
            ByteString byteStringWrap = this.bufferIsImmutable ? ByteString.wrap(this.buffer, this.pos, varint32) : ByteString.copyFrom(this.buffer, this.pos, varint32);
            this.pos += varint32;
            return byteStringWrap;
        }

        @Override // com.google.protobuf.Reader
        public void readBytesList(List<ByteString> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i11;
            if (WireFormat.getTagWireType(this.tag) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i11 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i11;
        }

        @Override // com.google.protobuf.Reader
        public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(1);
            return Double.longBitsToDouble(readLittleEndian64());
        }

        @Override // com.google.protobuf.Reader
        public void readDoubleList(List<Double> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof DoubleArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint32 = readVarint32();
                verifyPackedFixed64Length(varint32);
                int i13 = this.pos + varint32;
                while (this.pos < i13) {
                    list.add(Double.valueOf(Double.longBitsToDouble(readLittleEndian64_NoCheck())));
                }
                return;
            }
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    doubleArrayList.addDouble(readDouble());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int varint33 = readVarint32();
            verifyPackedFixed64Length(varint33);
            int i14 = this.pos + varint33;
            while (this.pos < i14) {
                doubleArrayList.addDouble(Double.longBitsToDouble(readLittleEndian64_NoCheck()));
            }
        }

        @Override // com.google.protobuf.Reader
        public int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.Reader
        public void readEnumList(List<Integer> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readEnum()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint33 = this.pos + readVarint32();
                while (this.pos < varint33) {
                    intArrayList.addInt(readVarint32());
                }
                return;
            }
            do {
                intArrayList.addInt(readEnum());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.Reader
        public int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // com.google.protobuf.Reader
        public void readFixed32List(List<Integer> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i13 = this.pos + varint32;
                    while (this.pos < i13) {
                        list.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(readFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int varint33 = readVarint32();
                verifyPackedFixed32Length(varint33);
                int i14 = this.pos + varint33;
                while (this.pos < i14) {
                    intArrayList.addInt(readLittleEndian32_NoCheck());
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                intArrayList.addInt(readFixed32());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.Reader
        public long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // com.google.protobuf.Reader
        public void readFixed64List(List<Long> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof LongArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        list.add(Long.valueOf(readFixed64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint32 = readVarint32();
                verifyPackedFixed64Length(varint32);
                int i13 = this.pos + varint32;
                while (this.pos < i13) {
                    list.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    longArrayList.addLong(readFixed64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int varint33 = readVarint32();
            verifyPackedFixed64Length(varint33);
            int i14 = this.pos + varint33;
            while (this.pos < i14) {
                longArrayList.addLong(readLittleEndian64_NoCheck());
            }
        }

        @Override // com.google.protobuf.Reader
        public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(5);
            return Float.intBitsToFloat(readLittleEndian32());
        }

        @Override // com.google.protobuf.Reader
        public void readFloatList(List<Float> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof FloatArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i13 = this.pos + varint32;
                    while (this.pos < i13) {
                        list.add(Float.valueOf(Float.intBitsToFloat(readLittleEndian32_NoCheck())));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            FloatArrayList floatArrayList = (FloatArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int varint33 = readVarint32();
                verifyPackedFixed32Length(varint33);
                int i14 = this.pos + varint33;
                while (this.pos < i14) {
                    floatArrayList.addFloat(Float.intBitsToFloat(readLittleEndian32_NoCheck()));
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                floatArrayList.addFloat(readFloat());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.Reader
        @Deprecated
        public <T> T readGroup(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(3);
            return (T) readGroup(Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        @Deprecated
        public <T> T readGroupBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(3);
            return (T) readGroup(schema, extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        @Deprecated
        public <T> void readGroupList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            readGroupList(list, Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.Reader
        public void readInt32List(List<Integer> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        list.add(Integer.valueOf(readInt32()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint32 = this.pos + readVarint32();
                while (this.pos < varint32) {
                    list.add(Integer.valueOf(readVarint32()));
                }
                requirePosition(varint32);
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    intArrayList.addInt(readInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int varint33 = this.pos + readVarint32();
            while (this.pos < varint33) {
                intArrayList.addInt(readVarint32());
            }
            requirePosition(varint33);
        }

        @Override // com.google.protobuf.Reader
        public long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // com.google.protobuf.Reader
        public void readInt64List(List<Long> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof LongArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        list.add(Long.valueOf(readInt64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint32 = this.pos + readVarint32();
                while (this.pos < varint32) {
                    list.add(Long.valueOf(readVarint64()));
                }
                requirePosition(varint32);
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    longArrayList.addLong(readInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int varint33 = this.pos + readVarint32();
            while (this.pos < varint33) {
                longArrayList.addLong(readVarint64());
            }
            requirePosition(varint33);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        public <K, V> void readMap(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            requireWireType(2);
            int varint32 = readVarint32();
            requireBytes(varint32);
            int i11 = this.limit;
            this.limit = this.pos + varint32;
            try {
                Object field = metadata.defaultKey;
                Object field2 = metadata.defaultValue;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        map.put(field, field2);
                        this.limit = i11;
                        return;
                    } else if (fieldNumber == 1) {
                        field = readField(metadata.keyType, null, null);
                    } else if (fieldNumber != 2) {
                        try {
                            if (!skipField()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!skipField()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        field2 = readField(metadata.valueType, metadata.defaultValue.getClass(), extensionRegistryLite);
                    }
                }
            } catch (Throwable th2) {
                this.limit = i11;
                throw th2;
            }
        }

        @Override // com.google.protobuf.Reader
        public <T> T readMessage(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(2);
            return (T) readMessage(Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public <T> T readMessageBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(2);
            return (T) readMessage(schema, extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public <T> void readMessageList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            readMessageList(list, Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        public int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // com.google.protobuf.Reader
        public void readSFixed32List(List<Integer> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i13 = this.pos + varint32;
                    while (this.pos < i13) {
                        list.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(readSFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int varint33 = readVarint32();
                verifyPackedFixed32Length(varint33);
                int i14 = this.pos + varint33;
                while (this.pos < i14) {
                    intArrayList.addInt(readLittleEndian32_NoCheck());
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                intArrayList.addInt(readSFixed32());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.Reader
        public long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // com.google.protobuf.Reader
        public void readSFixed64List(List<Long> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof LongArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        list.add(Long.valueOf(readSFixed64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint32 = readVarint32();
                verifyPackedFixed64Length(varint32);
                int i13 = this.pos + varint32;
                while (this.pos < i13) {
                    list.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    longArrayList.addLong(readSFixed64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int varint33 = readVarint32();
            verifyPackedFixed64Length(varint33);
            int i14 = this.pos + varint33;
            while (this.pos < i14) {
                longArrayList.addLong(readLittleEndian64_NoCheck());
            }
        }

        @Override // com.google.protobuf.Reader
        public int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(0);
            return CodedInputStream.decodeZigZag32(readVarint32());
        }

        @Override // com.google.protobuf.Reader
        public void readSInt32List(List<Integer> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        list.add(Integer.valueOf(CodedInputStream.decodeZigZag32(readVarint32())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readSInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint33 = this.pos + readVarint32();
                while (this.pos < varint33) {
                    intArrayList.addInt(CodedInputStream.decodeZigZag32(readVarint32()));
                }
                return;
            }
            do {
                intArrayList.addInt(readSInt32());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.Reader
        public long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(0);
            return CodedInputStream.decodeZigZag64(readVarint64());
        }

        @Override // com.google.protobuf.Reader
        public void readSInt64List(List<Long> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof LongArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        list.add(Long.valueOf(CodedInputStream.decodeZigZag64(readVarint64())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(readSInt64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint33 = this.pos + readVarint32();
                while (this.pos < varint33) {
                    longArrayList.addLong(CodedInputStream.decodeZigZag64(readVarint64()));
                }
                return;
            }
            do {
                longArrayList.addLong(readSInt64());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.Reader
        public String readString() {
            return readStringInternal(false);
        }

        public String readStringInternal(boolean z11) throws InvalidProtocolBufferException {
            requireWireType(2);
            int varint32 = readVarint32();
            if (varint32 == 0) {
                return "";
            }
            requireBytes(varint32);
            if (z11) {
                byte[] bArr = this.buffer;
                int i11 = this.pos;
                if (!Utf8.isValidUtf8(bArr, i11, i11 + varint32)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.buffer, this.pos, varint32, Internal.UTF_8);
            this.pos += varint32;
            return str;
        }

        @Override // com.google.protobuf.Reader
        public void readStringList(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            readStringListInternal(list, false);
        }

        public void readStringListInternal(List<String> list, boolean z11) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i11;
            int i12;
            if (WireFormat.getTagWireType(this.tag) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            if (!(list instanceof LazyStringList) || z11) {
                do {
                    list.add(readStringInternal(z11));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.Reader
        public void readStringListRequireUtf8(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            readStringListInternal(list, true);
        }

        @Override // com.google.protobuf.Reader
        public String readStringRequireUtf8() {
            return readStringInternal(true);
        }

        @Override // com.google.protobuf.Reader
        public int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.protobuf.Reader
        public void readUInt32List(List<Integer> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof IntArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int varint32 = this.pos + readVarint32();
                    while (this.pos < varint32) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readUInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i11;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint33 = this.pos + readVarint32();
                while (this.pos < varint33) {
                    intArrayList.addInt(readVarint32());
                }
                return;
            }
            do {
                intArrayList.addInt(readUInt32());
                if (isAtEnd()) {
                    return;
                } else {
                    i12 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i12;
        }

        @Override // com.google.protobuf.Reader
        public long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // com.google.protobuf.Reader
        public void readUInt64List(List<Long> list) throws InvalidProtocolBufferException {
            int i11;
            int i12;
            if (!(list instanceof LongArrayList)) {
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        list.add(Long.valueOf(readUInt64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i11 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i11;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int varint32 = this.pos + readVarint32();
                while (this.pos < varint32) {
                    list.add(Long.valueOf(readVarint64()));
                }
                requirePosition(varint32);
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    longArrayList.addLong(readUInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i12 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i12;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int varint33 = this.pos + readVarint32();
            while (this.pos < varint33) {
                longArrayList.addLong(readVarint64());
            }
            requirePosition(varint33);
        }

        public long readVarint64() throws InvalidProtocolBufferException {
            long j11;
            long j12;
            long j13;
            int i11 = this.pos;
            int i12 = this.limit;
            if (i12 == i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                this.pos = i13;
                return b11;
            }
            if (i12 - i13 < 9) {
                return readVarint64SlowPath();
            }
            int i14 = i11 + 2;
            int i15 = (bArr[i13] << 7) ^ b11;
            if (i15 < 0) {
                j11 = i15 ^ RangingPosition.RSSI_UNKNOWN;
            } else {
                int i16 = i11 + 3;
                int i17 = (bArr[i14] << 14) ^ i15;
                if (i17 >= 0) {
                    j11 = i17 ^ 16256;
                    i14 = i16;
                } else {
                    int i18 = i11 + 4;
                    int i19 = i17 ^ (bArr[i16] << 21);
                    if (i19 < 0) {
                        long j14 = (-2080896) ^ i19;
                        i14 = i18;
                        j11 = j14;
                    } else {
                        long j15 = i19;
                        i14 = i11 + 5;
                        long j16 = j15 ^ (((long) bArr[i18]) << 28);
                        if (j16 >= 0) {
                            j13 = 266354560;
                        } else {
                            int i21 = i11 + 6;
                            long j17 = j16 ^ (((long) bArr[i14]) << 35);
                            if (j17 < 0) {
                                j12 = -34093383808L;
                            } else {
                                i14 = i11 + 7;
                                j16 = j17 ^ (((long) bArr[i21]) << 42);
                                if (j16 >= 0) {
                                    j13 = 4363953127296L;
                                } else {
                                    i21 = i11 + 8;
                                    j17 = j16 ^ (((long) bArr[i14]) << 49);
                                    if (j17 < 0) {
                                        j12 = -558586000294016L;
                                    } else {
                                        i14 = i11 + 9;
                                        long j18 = (j17 ^ (((long) bArr[i21]) << 56)) ^ 71499008037633920L;
                                        if (j18 < 0) {
                                            int i22 = i11 + 10;
                                            if (bArr[i14] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i14 = i22;
                                        }
                                        j11 = j18;
                                    }
                                }
                            }
                            j11 = j17 ^ j12;
                            i14 = i21;
                        }
                        j11 = j16 ^ j13;
                    }
                }
            }
            this.pos = i14;
            return j11;
        }

        @Override // com.google.protobuf.Reader
        public boolean skipField() throws InvalidProtocolBufferException {
            int i11;
            if (isAtEnd() || (i11 = this.tag) == this.endGroupTag) {
                return false;
            }
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType == 0) {
                skipVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipBytes(readVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipGroup();
                return true;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipBytes(4);
            return true;
        }

        private <T> T readGroup(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) {
            T tNewInstance = schema.newInstance();
            mergeGroupField(tNewInstance, schema, extensionRegistryLite);
            schema.makeImmutable(tNewInstance);
            return tNewInstance;
        }

        private <T> T readMessage(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            T tNewInstance = schema.newInstance();
            mergeMessageField(tNewInstance, schema, extensionRegistryLite);
            schema.makeImmutable(tNewInstance);
            return tNewInstance;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        @Deprecated
        public <T> void readGroupList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i11;
            if (WireFormat.getTagWireType(this.tag) == 3) {
                int i12 = this.tag;
                do {
                    list.add(readGroup(schema, extensionRegistryLite));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == i12);
                this.pos = i11;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        public <T> void readMessageList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i11;
            if (WireFormat.getTagWireType(this.tag) == 2) {
                int i12 = this.tag;
                do {
                    list.add(readMessage(schema, extensionRegistryLite));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i11 = this.pos;
                    }
                } while (readVarint32() == i12);
                this.pos = i11;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private BinaryReader() {
    }
}
