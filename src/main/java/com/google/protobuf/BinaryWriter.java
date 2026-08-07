package com.google.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import com.plaid.internal.EnumC4419g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import okhttp3.internal.http2.Http2Stream;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
abstract class BinaryWriter extends ByteOutput implements Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    final ArrayDeque<AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* JADX INFO: renamed from: com.google.protobuf.BinaryWriter$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private static final class SafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(BufferAllocator bufferAllocator, int i11) {
            super(bufferAllocator, i11, null);
            nextBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return this.pos + 1;
        }

        private void writeVarint32FiveBytes(int i11) {
            ByteBuffer byteBuffer = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            byteBuffer.put(i12, (byte) (i11 >>> 28));
            int i13 = this.pos;
            this.pos = i13 - 4;
            this.buffer.putInt(i13 - 3, (i11 & 127) | 128 | ((((i11 >>> 21) & 127) | 128) << 24) | ((((i11 >>> 14) & 127) | 128) << 16) | ((((i11 >>> 7) & 127) | 128) << 8));
        }

        private void writeVarint32FourBytes(int i11) {
            int i12 = this.pos;
            this.pos = i12 - 4;
            this.buffer.putInt(i12 - 3, (i11 & 127) | 128 | ((266338304 & i11) << 3) | (((2080768 & i11) | PKIFailureInfo.badSenderNonce) << 2) | (((i11 & 16256) | 16384) << 1));
        }

        private void writeVarint32OneByte(int i11) {
            ByteBuffer byteBuffer = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            byteBuffer.put(i12, (byte) i11);
        }

        private void writeVarint32ThreeBytes(int i11) {
            int i12 = this.pos - 3;
            this.pos = i12;
            this.buffer.putInt(i12, (((i11 & 127) | 128) << 8) | ((2080768 & i11) << 10) | (((i11 & 16256) | 16384) << 9));
        }

        private void writeVarint32TwoBytes(int i11) {
            int i12 = this.pos;
            this.pos = i12 - 2;
            this.buffer.putShort(i12 - 1, (short) ((i11 & 127) | 128 | ((i11 & 16256) << 1)));
        }

        private void writeVarint64EightBytes(long j11) {
            int i11 = this.pos;
            this.pos = i11 - 8;
            this.buffer.putLong(i11 - 7, (j11 & 127) | 128 | ((71494644084506624L & j11) << 7) | (((558551906910208L & j11) | 562949953421312L) << 6) | (((4363686772736L & j11) | 4398046511104L) << 5) | (((34091302912L & j11) | 34359738368L) << 4) | (((266338304 & j11) | 268435456) << 3) | (((2080768 & j11) | 2097152) << 2) | (((16256 & j11) | Http2Stream.EMIT_BUFFER_SIZE) << 1));
        }

        private void writeVarint64EightBytesWithSign(long j11) {
            int i11 = this.pos;
            this.pos = i11 - 8;
            this.buffer.putLong(i11 - 7, (j11 & 127) | 128 | (((71494644084506624L & j11) | 72057594037927936L) << 7) | (((558551906910208L & j11) | 562949953421312L) << 6) | (((4363686772736L & j11) | 4398046511104L) << 5) | (((34091302912L & j11) | 34359738368L) << 4) | (((266338304 & j11) | 268435456) << 3) | (((2080768 & j11) | 2097152) << 2) | (((16256 & j11) | Http2Stream.EMIT_BUFFER_SIZE) << 1));
        }

        private void writeVarint64FiveBytes(long j11) {
            int i11 = this.pos;
            this.pos = i11 - 5;
            this.buffer.putLong(i11 - 7, (((j11 & 127) | 128) << 24) | ((34091302912L & j11) << 28) | (((266338304 & j11) | 268435456) << 27) | (((2080768 & j11) | 2097152) << 26) | (((16256 & j11) | Http2Stream.EMIT_BUFFER_SIZE) << 25));
        }

        private void writeVarint64FourBytes(long j11) {
            writeVarint32FourBytes((int) j11);
        }

        private void writeVarint64NineBytes(long j11) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, (byte) (j11 >>> 56));
            writeVarint64EightBytesWithSign(j11 & 72057594037927935L);
        }

        private void writeVarint64OneByte(long j11) {
            writeVarint32OneByte((int) j11);
        }

        private void writeVarint64SevenBytes(long j11) {
            int i11 = this.pos - 7;
            this.pos = i11;
            this.buffer.putLong(i11, (((j11 & 127) | 128) << 8) | ((558551906910208L & j11) << 14) | (((4363686772736L & j11) | 4398046511104L) << 13) | (((34091302912L & j11) | 34359738368L) << 12) | (((266338304 & j11) | 268435456) << 11) | (((2080768 & j11) | 2097152) << 10) | (((16256 & j11) | Http2Stream.EMIT_BUFFER_SIZE) << 9));
        }

        private void writeVarint64SixBytes(long j11) {
            int i11 = this.pos;
            this.pos = i11 - 6;
            this.buffer.putLong(i11 - 7, (((j11 & 127) | 128) << 16) | ((4363686772736L & j11) << 21) | (((34091302912L & j11) | 34359738368L) << 20) | (((266338304 & j11) | 268435456) << 19) | (((2080768 & j11) | 2097152) << 18) | (((16256 & j11) | Http2Stream.EMIT_BUFFER_SIZE) << 17));
        }

        private void writeVarint64TenBytes(long j11) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, (byte) (j11 >>> 63));
            ByteBuffer byteBuffer2 = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            byteBuffer2.put(i12, (byte) (((j11 >>> 56) & 127) | 128));
            writeVarint64EightBytesWithSign(j11 & 72057594037927935L);
        }

        private void writeVarint64ThreeBytes(long j11) {
            writeVarint32ThreeBytes((int) j11);
        }

        private void writeVarint64TwoBytes(long j11) {
            writeVarint32TwoBytes((int) j11);
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                Java8Compatibility.position(this.buffer, this.pos + 1);
                this.buffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i11) {
            if (spaceLeft() < i11) {
                nextBuffer(i11);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b11) {
            ByteBuffer byteBuffer = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            byteBuffer.put(i11, b11);
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i11, boolean z11) {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i11, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i11, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int i11) {
            writeTag(i11, 4);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i11, int i12) {
            requireSpace(9);
            writeFixed32(i12);
            writeTag(i11, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i11, long j11) {
            requireSpace(13);
            writeFixed64(j11);
            writeTag(i11, 1);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeGroup(int i11, Object obj) {
            writeTag(i11, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i11, int i12) {
            requireSpace(15);
            writeInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                this.totalDoneBytes += i12;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i11, i12));
                nextBuffer();
            } else {
                int i13 = this.pos - i12;
                this.pos = i13;
                Java8Compatibility.position(this.buffer, i13 + 1);
                this.buffer.put(bArr, i11, i12);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i11, Object obj) {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i11, int i12) {
            requireSpace(10);
            writeSInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i11, long j11) {
            requireSpace(15);
            writeSInt64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int i11) {
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i11, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i11, int i12) {
            writeVarint32(WireFormat.makeTag(i11, i12));
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i11, int i12) {
            requireSpace(10);
            writeVarint32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i11, long j11) {
            requireSpace(15);
            writeVarint64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i11) {
            if ((i11 & RangingPosition.RSSI_UNKNOWN) == 0) {
                writeVarint32OneByte(i11);
                return;
            }
            if ((i11 & (-16384)) == 0) {
                writeVarint32TwoBytes(i11);
                return;
            }
            if (((-2097152) & i11) == 0) {
                writeVarint32ThreeBytes(i11);
            } else if (((-268435456) & i11) == 0) {
                writeVarint32FourBytes(i11);
            } else {
                writeVarint32FiveBytes(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j11) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j11)) {
                case 1:
                    writeVarint64OneByte(j11);
                    break;
                case 2:
                    writeVarint64TwoBytes(j11);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j11);
                    break;
                case 4:
                    writeVarint64FourBytes(j11);
                    break;
                case 5:
                    writeVarint64FiveBytes(j11);
                    break;
                case 6:
                    writeVarint64SixBytes(j11);
                    break;
                case 7:
                    writeVarint64SevenBytes(j11);
                    break;
                case 8:
                    writeVarint64EightBytes(j11);
                    break;
                case 9:
                    writeVarint64NineBytes(j11);
                    break;
                case 10:
                    writeVarint64TenBytes(j11);
                    break;
            }
        }

        private void nextBuffer(int i11) {
            nextBuffer(newDirectBuffer(i11));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                nextBuffer(i12);
            }
            int i13 = this.pos - i12;
            this.pos = i13;
            Java8Compatibility.position(this.buffer, i13 + 1);
            this.buffer.put(bArr, i11, i12);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
                if (byteBufferNioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = byteBufferNioBuffer;
                    Java8Compatibility.limit(byteBufferNioBuffer, byteBufferNioBuffer.capacity());
                    Java8Compatibility.position(this.buffer, 0);
                    this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                    int iLimit = this.buffer.limit() - 1;
                    this.limitMinusOne = iLimit;
                    this.pos = iLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i11) {
            int i12 = this.pos;
            this.pos = i12 - 4;
            this.buffer.putInt(i12 - 3, i11);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j11) {
            int i11 = this.pos;
            this.pos = i11 - 8;
            this.buffer.putLong(i11 - 7, j11);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i11, Object obj, Schema schema) {
            writeTag(i11, 4);
            schema.writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i11) {
            if (i11 >= 0) {
                writeVarint32(i11);
            } else {
                writeVarint64(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i11) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i11));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j11) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j11));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i11 = this.pos - iRemaining;
            this.pos = i11;
            Java8Compatibility.position(this.buffer, i11 + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i11, Object obj, Schema schema) {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            int i11;
            int i12;
            int i13;
            char cCharAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.buffer.put(this.pos + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i13 = this.pos) >= 0) {
                    ByteBuffer byteBuffer = this.buffer;
                    this.pos = i13 - 1;
                    byteBuffer.put(i13, (byte) cCharAt2);
                } else if (cCharAt2 < 2048 && (i12 = this.pos) > 0) {
                    ByteBuffer byteBuffer2 = this.buffer;
                    this.pos = i12 - 1;
                    byteBuffer2.put(i12, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.buffer;
                    int i14 = this.pos;
                    this.pos = i14 - 1;
                    byteBuffer3.put(i14, (byte) ((cCharAt2 >>> 6) | 960));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i11 = this.pos) > 1) {
                    ByteBuffer byteBuffer4 = this.buffer;
                    this.pos = i11 - 1;
                    byteBuffer4.put(i11, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.buffer;
                    int i15 = this.pos;
                    this.pos = i15 - 1;
                    byteBuffer5.put(i15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.buffer;
                    int i16 = this.pos;
                    this.pos = i16 - 1;
                    byteBuffer6.put(i16, (byte) ((cCharAt2 >>> '\f') | 480));
                } else {
                    if (this.pos > 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                ByteBuffer byteBuffer7 = this.buffer;
                                int i17 = this.pos;
                                this.pos = i17 - 1;
                                byteBuffer7.put(i17, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.buffer;
                                int i18 = this.pos;
                                this.pos = i18 - 1;
                                byteBuffer8.put(i18, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.buffer;
                                int i19 = this.pos;
                                this.pos = i19 - 1;
                                byteBuffer9.put(i19, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.buffer;
                                int i21 = this.pos;
                                this.pos = i21 - 1;
                                byteBuffer10.put(i21, (byte) ((codePoint >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                int i11 = this.pos - iRemaining;
                this.pos = i11;
                Java8Compatibility.position(this.buffer, i11 + 1);
                this.buffer.put(byteBuffer);
            }
        }
    }

    private static final class SafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(BufferAllocator bufferAllocator, int i11) {
            super(bufferAllocator, i11, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (i11 >>> 28);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((i11 >>> 21) & 127) | 128);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((i11 >>> 14) & 127) | 128);
            int i16 = i12 - 4;
            this.pos = i16;
            bArr[i15] = (byte) (((i11 >>> 7) & 127) | 128);
            this.pos = i12 - 5;
            bArr[i16] = (byte) ((i11 & 127) | 128);
        }

        private void writeVarint32FourBytes(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (i11 >>> 21);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((i11 >>> 14) & 127) | 128);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((i11 >>> 7) & 127) | 128);
            this.pos = i12 - 4;
            bArr[i15] = (byte) ((i11 & 127) | 128);
        }

        private void writeVarint32OneByte(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            bArr[i12] = (byte) i11;
        }

        private void writeVarint32ThreeBytes(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (i11 >>> 14);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((i11 >>> 7) & 127) | 128);
            this.pos = i12 - 3;
            bArr[i14] = (byte) ((i11 & 127) | 128);
        }

        private void writeVarint32TwoBytes(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (i11 >>> 7);
            this.pos = i12 - 2;
            bArr[i13] = (byte) ((i11 & 127) | 128);
        }

        private void writeVarint64EightBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 49);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 42) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 35) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 28) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((j11 >>> 21) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((j11 >>> 14) & 127) | 128);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 8;
            bArr[i18] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64FiveBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 28);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 21) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 14) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 5;
            bArr[i15] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64FourBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 21);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 14) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 4;
            bArr[i14] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64NineBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 56);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 49) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 42) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 35) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((j11 >>> 28) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((j11 >>> 21) & 127) | 128);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((j11 >>> 14) & 127) | 128);
            int i19 = i11 - 8;
            this.pos = i19;
            bArr[i18] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 9;
            bArr[i19] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64OneByte(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            bArr[i11] = (byte) j11;
        }

        private void writeVarint64SevenBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 42);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 35) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 28) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 21) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((j11 >>> 14) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 7;
            bArr[i17] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64SixBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 35);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 28) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 21) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 14) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 6;
            bArr[i16] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64TenBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 63);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 56) & 127) | 128);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((j11 >>> 49) & 127) | 128);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((j11 >>> 42) & 127) | 128);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((j11 >>> 35) & 127) | 128);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((j11 >>> 28) & 127) | 128);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((j11 >>> 21) & 127) | 128);
            int i19 = i11 - 8;
            this.pos = i19;
            bArr[i18] = (byte) (((j11 >>> 14) & 127) | 128);
            int i21 = i11 - 9;
            this.pos = i21;
            bArr[i19] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 10;
            bArr[i21] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64ThreeBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (((int) j11) >>> 14);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((j11 >>> 7) & 127) | 128);
            this.pos = i11 - 3;
            bArr[i13] = (byte) ((j11 & 127) | 128);
        }

        private void writeVarint64TwoBytes(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (j11 >>> 7);
            this.pos = i11 - 2;
            bArr[i12] = (byte) ((((int) j11) & 127) | 128);
        }

        int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                allocatedBuffer.position((this.pos - allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i11) {
            if (spaceLeft() < i11) {
                nextBuffer(i11);
            }
        }

        int spaceLeft() {
            return this.pos - this.offsetMinusOne;
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            this.pos = i11 - 1;
            bArr[i11] = b11;
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i11, boolean z11) {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i11, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i11, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeEndGroup(int i11) {
            writeTag(i11, 4);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i11, int i12) {
            requireSpace(9);
            writeFixed32(i12);
            writeTag(i11, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i11, long j11) {
            requireSpace(13);
            writeFixed64(j11);
            writeTag(i11, 1);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeGroup(int i11, Object obj) {
            writeTag(i11, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i11, int i12) {
            requireSpace(15);
            writeInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                this.totalDoneBytes += i12;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i11, i12));
                nextBuffer();
            } else {
                int i13 = this.pos - i12;
                this.pos = i13;
                System.arraycopy(bArr, i11, this.buffer, i13 + 1, i12);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i11, Object obj) {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i11, int i12) {
            requireSpace(10);
            writeSInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i11, long j11) {
            requireSpace(15);
            writeSInt64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeStartGroup(int i11) {
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i11, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i11, int i12) {
            writeVarint32(WireFormat.makeTag(i11, i12));
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i11, int i12) {
            requireSpace(10);
            writeVarint32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i11, long j11) {
            requireSpace(15);
            writeVarint64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i11) {
            if ((i11 & RangingPosition.RSSI_UNKNOWN) == 0) {
                writeVarint32OneByte(i11);
                return;
            }
            if ((i11 & (-16384)) == 0) {
                writeVarint32TwoBytes(i11);
                return;
            }
            if (((-2097152) & i11) == 0) {
                writeVarint32ThreeBytes(i11);
            } else if (((-268435456) & i11) == 0) {
                writeVarint32FourBytes(i11);
            } else {
                writeVarint32FiveBytes(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j11) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j11)) {
                case 1:
                    writeVarint64OneByte(j11);
                    break;
                case 2:
                    writeVarint64TwoBytes(j11);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j11);
                    break;
                case 4:
                    writeVarint64FourBytes(j11);
                    break;
                case 5:
                    writeVarint64FiveBytes(j11);
                    break;
                case 6:
                    writeVarint64SixBytes(j11);
                    break;
                case 7:
                    writeVarint64SevenBytes(j11);
                    break;
                case 8:
                    writeVarint64EightBytes(j11);
                    break;
                case 9:
                    writeVarint64NineBytes(j11);
                    break;
                case 10:
                    writeVarint64TenBytes(j11);
                    break;
            }
        }

        private void nextBuffer(int i11) {
            nextBuffer(newHeapBuffer(i11));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                nextBuffer(i12);
            }
            int i13 = this.pos - i12;
            this.pos = i13;
            System.arraycopy(bArr, i11, this.buffer, i13 + 1, i12);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                int iArrayOffset = allocatedBuffer.arrayOffset();
                this.limit = allocatedBuffer.limit() + iArrayOffset;
                int iPosition = iArrayOffset + allocatedBuffer.position();
                this.offset = iPosition;
                this.offsetMinusOne = iPosition - 1;
                int i11 = this.limit - 1;
                this.limitMinusOne = i11;
                this.pos = i11;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i11) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) ((i11 >> 24) & 255);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) ((i11 >> 16) & 255);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) ((i11 >> 8) & 255);
            this.pos = i12 - 4;
            bArr[i15] = (byte) (i11 & 255);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j11) {
            byte[] bArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 - 1;
            this.pos = i12;
            bArr[i11] = (byte) (((int) (j11 >> 56)) & 255);
            int i13 = i11 - 2;
            this.pos = i13;
            bArr[i12] = (byte) (((int) (j11 >> 48)) & 255);
            int i14 = i11 - 3;
            this.pos = i14;
            bArr[i13] = (byte) (((int) (j11 >> 40)) & 255);
            int i15 = i11 - 4;
            this.pos = i15;
            bArr[i14] = (byte) (((int) (j11 >> 32)) & 255);
            int i16 = i11 - 5;
            this.pos = i16;
            bArr[i15] = (byte) (((int) (j11 >> 24)) & 255);
            int i17 = i11 - 6;
            this.pos = i17;
            bArr[i16] = (byte) (((int) (j11 >> 16)) & 255);
            int i18 = i11 - 7;
            this.pos = i18;
            bArr[i17] = (byte) (((int) (j11 >> 8)) & 255);
            this.pos = i11 - 8;
            bArr[i18] = (byte) (((int) j11) & 255);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i11, Object obj, Schema schema) {
            writeTag(i11, 4);
            schema.writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i11) {
            if (i11 >= 0) {
                writeVarint32(i11);
            } else {
                writeVarint64(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i11) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i11));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j11) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j11));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i11 = this.pos - iRemaining;
            this.pos = i11;
            byteBuffer.get(this.buffer, i11 + 1, iRemaining);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            int i11 = this.pos - iRemaining;
            this.pos = i11;
            byteBuffer.get(this.buffer, i11 + 1, iRemaining);
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i11, Object obj, Schema schema) {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            int i11;
            int i12;
            int i13;
            char cCharAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.buffer[this.pos + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i13 = this.pos) > this.offsetMinusOne) {
                    byte[] bArr = this.buffer;
                    this.pos = i13 - 1;
                    bArr[i13] = (byte) cCharAt2;
                } else if (cCharAt2 < 2048 && (i12 = this.pos) > this.offset) {
                    byte[] bArr2 = this.buffer;
                    int i14 = i12 - 1;
                    this.pos = i14;
                    bArr2[i12] = (byte) ((cCharAt2 & '?') | 128);
                    this.pos = i12 - 2;
                    bArr2[i14] = (byte) ((cCharAt2 >>> 6) | 960);
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i11 = this.pos) > this.offset + 1) {
                    byte[] bArr3 = this.buffer;
                    int i15 = i11 - 1;
                    this.pos = i15;
                    bArr3[i11] = (byte) ((cCharAt2 & '?') | 128);
                    int i16 = i11 - 2;
                    this.pos = i16;
                    bArr3[i15] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    this.pos = i11 - 3;
                    bArr3[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                } else {
                    if (this.pos > this.offset + 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                byte[] bArr4 = this.buffer;
                                int i17 = this.pos;
                                int i18 = i17 - 1;
                                this.pos = i18;
                                bArr4[i17] = (byte) ((codePoint & 63) | 128);
                                int i19 = i17 - 2;
                                this.pos = i19;
                                bArr4[i18] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i21 = i17 - 3;
                                this.pos = i21;
                                bArr4[i19] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.pos = i17 - 4;
                                bArr4[i21] = (byte) ((codePoint >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }
    }

    private static final class UnsafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(BufferAllocator bufferAllocator, int i11) {
            super(bufferAllocator, i11, null);
            nextBuffer();
        }

        private int bufferPos() {
            return (int) (this.pos - this.bufferOffset);
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        private void writeVarint32FiveBytes(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (i11 >>> 28));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((i11 >>> 21) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((i11 >>> 14) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((i11 >>> 7) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) ((i11 & 127) | 128));
        }

        private void writeVarint32FourBytes(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (i11 >>> 21));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((i11 >>> 14) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((i11 >>> 7) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((i11 & 127) | 128));
        }

        private void writeVarint32OneByte(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) i11);
        }

        private void writeVarint32ThreeBytes(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (i11 >>> 14));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((i11 >>> 7) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((i11 & 127) | 128));
        }

        private void writeVarint32TwoBytes(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (i11 >>> 7));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) ((i11 & 127) | 128));
        }

        private void writeVarint64EightBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (j11 >>> 49));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j11 >>> 42) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j11 >>> 35) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j11 >>> 28) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j11 >>> 21) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j11 >>> 14) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j11 >>> 7) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (j11 >>> 28));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j11 >>> 21) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j11 >>> 14) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j11 >>> 7) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64FourBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (j11 >>> 21));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j11 >>> 14) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j11 >>> 7) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64NineBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (j11 >>> 56));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j11 >>> 49) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j11 >>> 42) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j11 >>> 35) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j11 >>> 28) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j11 >>> 21) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j11 >>> 14) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((j11 >>> 7) & 127) | 128));
            long j21 = this.pos;
            this.pos = j21 - 1;
            UnsafeUtil.putByte(j21, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64OneByte(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) j11);
        }

        private void writeVarint64SevenBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (j11 >>> 42));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j11 >>> 35) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j11 >>> 28) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j11 >>> 21) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j11 >>> 14) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j11 >>> 7) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64SixBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (j11 >>> 35));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j11 >>> 28) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j11 >>> 21) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j11 >>> 14) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j11 >>> 7) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64TenBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (j11 >>> 63));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j11 >>> 56) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j11 >>> 49) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j11 >>> 42) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j11 >>> 35) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j11 >>> 28) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j11 >>> 21) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((j11 >>> 14) & 127) | 128));
            long j21 = this.pos;
            this.pos = j21 - 1;
            UnsafeUtil.putByte(j21, (byte) (((j11 >>> 7) & 127) | 128));
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.putByte(j22, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((int) j11) >>> 14));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j11 >>> 7) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64TwoBytes(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (j11 >>> 7));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((((int) j11) & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i11) {
            if (spaceLeft() < i11) {
                nextBuffer(i11);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, b11);
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i11, boolean z11) {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i11, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i11, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int i11) {
            writeTag(i11, 4);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i11, int i12) {
            requireSpace(9);
            writeFixed32(i12);
            writeTag(i11, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i11, long j11) {
            requireSpace(13);
            writeFixed64(j11);
            writeTag(i11, 1);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i11, Object obj) {
            writeTag(i11, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i11, int i12) {
            requireSpace(15);
            writeInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                this.totalDoneBytes += i12;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i11, i12));
                nextBuffer();
            } else {
                this.pos -= (long) i12;
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(bArr, i11, i12);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i11, Object obj) {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i11, int i12) {
            requireSpace(10);
            writeSInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i11, long j11) {
            requireSpace(15);
            writeSInt64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int i11) {
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i11, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i11, int i12) {
            writeVarint32(WireFormat.makeTag(i11, i12));
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i11, int i12) {
            requireSpace(10);
            writeVarint32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i11, long j11) {
            requireSpace(15);
            writeVarint64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i11) {
            if ((i11 & RangingPosition.RSSI_UNKNOWN) == 0) {
                writeVarint32OneByte(i11);
                return;
            }
            if ((i11 & (-16384)) == 0) {
                writeVarint32TwoBytes(i11);
                return;
            }
            if (((-2097152) & i11) == 0) {
                writeVarint32ThreeBytes(i11);
            } else if (((-268435456) & i11) == 0) {
                writeVarint32FourBytes(i11);
            } else {
                writeVarint32FiveBytes(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j11) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j11)) {
                case 1:
                    writeVarint64OneByte(j11);
                    break;
                case 2:
                    writeVarint64TwoBytes(j11);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j11);
                    break;
                case 4:
                    writeVarint64FourBytes(j11);
                    break;
                case 5:
                    writeVarint64FiveBytes(j11);
                    break;
                case 6:
                    writeVarint64SixBytes(j11);
                    break;
                case 7:
                    writeVarint64SevenBytes(j11);
                    break;
                case 8:
                    writeVarint64EightBytes(j11);
                    break;
                case 9:
                    writeVarint64NineBytes(j11);
                    break;
                case 10:
                    writeVarint64TenBytes(j11);
                    break;
            }
        }

        private void nextBuffer(int i11) {
            nextBuffer(newDirectBuffer(i11));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i11, int i12) {
            if (spaceLeft() < i12) {
                nextBuffer(i12);
            }
            this.pos -= (long) i12;
            Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(bArr, i11, i12);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
                if (byteBufferNioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = byteBufferNioBuffer;
                    Java8Compatibility.limit(byteBufferNioBuffer, byteBufferNioBuffer.capacity());
                    Java8Compatibility.position(this.buffer, 0);
                    long jAddressOffset = UnsafeUtil.addressOffset(this.buffer);
                    this.bufferOffset = jAddressOffset;
                    long jLimit = jAddressOffset + ((long) (this.buffer.limit() - 1));
                    this.limitMinusOne = jLimit;
                    this.pos = jLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i11) {
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) ((i11 >> 24) & 255));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) ((i11 >> 16) & 255));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((i11 >> 8) & 255));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (i11 & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j11) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((int) (j11 >> 56)) & 255));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((int) (j11 >> 48)) & 255));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((int) (j11 >> 40)) & 255));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((int) (j11 >> 32)) & 255));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((int) (j11 >> 24)) & 255));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((int) (j11 >> 16)) & 255));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((int) (j11 >> 8)) & 255));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((int) j11) & 255));
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i11, Object obj, Schema schema) {
            writeTag(i11, 4);
            schema.writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i11) {
            if (i11 >= 0) {
                writeVarint32(i11);
            } else {
                writeVarint64(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i11) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i11));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j11) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j11));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            this.pos -= (long) iRemaining;
            Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i11, Object obj, Schema schema) {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Code duplicated, block: B:19:0x0049  */
        /* JADX WARN: Code duplicated, block: B:21:0x0051  */
        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:24:0x0071  */
        /* JADX WARN: Code duplicated, block: B:26:0x0076  */
        /* JADX WARN: Code duplicated, block: B:28:0x007f  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:37:0x0109  */
        /* JADX WARN: Code duplicated, block: B:43:0x0101 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0101 A[SYNTHETIC] */
        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            long j11;
            char cCharAt;
            long j12;
            char cCharAt2;
            requireSpace(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt2 = str.charAt(length)) >= 128) {
                    break;
                }
                long j13 = this.pos;
                this.pos = j13 - 1;
                UnsafeUtil.putByte(j13, (byte) cCharAt2);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char cCharAt3 = str.charAt(length);
                if (cCharAt3 < 128) {
                    long j14 = this.pos;
                    if (j14 >= this.bufferOffset) {
                        this.pos = j14 - 1;
                        UnsafeUtil.putByte(j14, (byte) cCharAt3);
                    } else if (cCharAt3 < 2048) {
                        j12 = this.pos;
                        if (j12 > this.bufferOffset) {
                            this.pos = j12 - 1;
                            UnsafeUtil.putByte(j12, (byte) ((cCharAt3 & '?') | 128));
                            long j15 = this.pos;
                            this.pos = j15 - 1;
                            UnsafeUtil.putByte(j15, (byte) ((cCharAt3 >>> 6) | 960));
                        } else if (cCharAt3 >= 55296 || 57343 < cCharAt3) {
                            j11 = this.pos;
                            if (j11 > this.bufferOffset + 1) {
                                this.pos = j11 - 1;
                                UnsafeUtil.putByte(j11, (byte) ((cCharAt3 & '?') | 128));
                                long j16 = this.pos;
                                this.pos = j16 - 1;
                                UnsafeUtil.putByte(j16, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j17 = this.pos;
                                this.pos = j17 - 1;
                                UnsafeUtil.putByte(j17, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.pos > this.bufferOffset + 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j18 = this.pos;
                                            this.pos = j18 - 1;
                                            UnsafeUtil.putByte(j18, (byte) ((codePoint & 63) | 128));
                                            long j19 = this.pos;
                                            this.pos = j19 - 1;
                                            UnsafeUtil.putByte(j19, (byte) (((codePoint >>> 6) & 63) | 128));
                                            long j21 = this.pos;
                                            this.pos = j21 - 1;
                                            UnsafeUtil.putByte(j21, (byte) (((codePoint >>> 12) & 63) | 128));
                                            long j22 = this.pos;
                                            this.pos = j22 - 1;
                                            UnsafeUtil.putByte(j22, (byte) ((codePoint >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                requireSpace(length);
                                length++;
                            }
                        } else {
                            if (this.pos > this.bufferOffset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint2 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j110 = this.pos;
                                        this.pos = j110 - 1;
                                        UnsafeUtil.putByte(j110, (byte) ((codePoint2 & 63) | 128));
                                        long j111 = this.pos;
                                        this.pos = j111 - 1;
                                        UnsafeUtil.putByte(j111, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        long j23 = this.pos;
                                        this.pos = j23 - 1;
                                        UnsafeUtil.putByte(j23, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j24 = this.pos;
                                        this.pos = j24 - 1;
                                        UnsafeUtil.putByte(j24, (byte) ((codePoint2 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else if (cCharAt3 >= 55296) {
                        j11 = this.pos;
                        if (j11 > this.bufferOffset + 1) {
                            this.pos = j11 - 1;
                            UnsafeUtil.putByte(j11, (byte) ((cCharAt3 & '?') | 128));
                            long j112 = this.pos;
                            this.pos = j112 - 1;
                            UnsafeUtil.putByte(j112, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j113 = this.pos;
                            this.pos = j113 - 1;
                            UnsafeUtil.putByte(j113, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.bufferOffset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint3 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j114 = this.pos;
                                        this.pos = j114 - 1;
                                        UnsafeUtil.putByte(j114, (byte) ((codePoint3 & 63) | 128));
                                        long j115 = this.pos;
                                        this.pos = j115 - 1;
                                        UnsafeUtil.putByte(j115, (byte) (((codePoint3 >>> 6) & 63) | 128));
                                        long j25 = this.pos;
                                        this.pos = j25 - 1;
                                        UnsafeUtil.putByte(j25, (byte) (((codePoint3 >>> 12) & 63) | 128));
                                        long j26 = this.pos;
                                        this.pos = j26 - 1;
                                        UnsafeUtil.putByte(j26, (byte) ((codePoint3 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else {
                        j11 = this.pos;
                        if (j11 > this.bufferOffset + 1) {
                            this.pos = j11 - 1;
                            UnsafeUtil.putByte(j11, (byte) ((cCharAt3 & '?') | 128));
                            long j116 = this.pos;
                            this.pos = j116 - 1;
                            UnsafeUtil.putByte(j116, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j117 = this.pos;
                            this.pos = j117 - 1;
                            UnsafeUtil.putByte(j117, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.bufferOffset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint4 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j118 = this.pos;
                                        this.pos = j118 - 1;
                                        UnsafeUtil.putByte(j118, (byte) ((codePoint4 & 63) | 128));
                                        long j119 = this.pos;
                                        this.pos = j119 - 1;
                                        UnsafeUtil.putByte(j119, (byte) (((codePoint4 >>> 6) & 63) | 128));
                                        long j27 = this.pos;
                                        this.pos = j27 - 1;
                                        UnsafeUtil.putByte(j27, (byte) (((codePoint4 >>> 12) & 63) | 128));
                                        long j28 = this.pos;
                                        this.pos = j28 - 1;
                                        UnsafeUtil.putByte(j28, (byte) ((codePoint4 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 < 2048) {
                    j12 = this.pos;
                    if (j12 > this.bufferOffset) {
                        this.pos = j12 - 1;
                        UnsafeUtil.putByte(j12, (byte) ((cCharAt3 & '?') | 128));
                        long j120 = this.pos;
                        this.pos = j120 - 1;
                        UnsafeUtil.putByte(j120, (byte) ((cCharAt3 >>> 6) | 960));
                    } else if (cCharAt3 >= 55296) {
                        j11 = this.pos;
                        if (j11 > this.bufferOffset + 1) {
                            this.pos = j11 - 1;
                            UnsafeUtil.putByte(j11, (byte) ((cCharAt3 & '?') | 128));
                            long j1110 = this.pos;
                            this.pos = j1110 - 1;
                            UnsafeUtil.putByte(j1110, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j1111 = this.pos;
                            this.pos = j1111 - 1;
                            UnsafeUtil.putByte(j1111, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.bufferOffset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint5 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j1112 = this.pos;
                                        this.pos = j1112 - 1;
                                        UnsafeUtil.putByte(j1112, (byte) ((codePoint5 & 63) | 128));
                                        long j1113 = this.pos;
                                        this.pos = j1113 - 1;
                                        UnsafeUtil.putByte(j1113, (byte) (((codePoint5 >>> 6) & 63) | 128));
                                        long j29 = this.pos;
                                        this.pos = j29 - 1;
                                        UnsafeUtil.putByte(j29, (byte) (((codePoint5 >>> 12) & 63) | 128));
                                        long j210 = this.pos;
                                        this.pos = j210 - 1;
                                        UnsafeUtil.putByte(j210, (byte) ((codePoint5 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else {
                        j11 = this.pos;
                        if (j11 > this.bufferOffset + 1) {
                            this.pos = j11 - 1;
                            UnsafeUtil.putByte(j11, (byte) ((cCharAt3 & '?') | 128));
                            long j1114 = this.pos;
                            this.pos = j1114 - 1;
                            UnsafeUtil.putByte(j1114, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j1115 = this.pos;
                            this.pos = j1115 - 1;
                            UnsafeUtil.putByte(j1115, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.bufferOffset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint6 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j1116 = this.pos;
                                        this.pos = j1116 - 1;
                                        UnsafeUtil.putByte(j1116, (byte) ((codePoint6 & 63) | 128));
                                        long j1117 = this.pos;
                                        this.pos = j1117 - 1;
                                        UnsafeUtil.putByte(j1117, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                        long j211 = this.pos;
                                        this.pos = j211 - 1;
                                        UnsafeUtil.putByte(j211, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                        long j212 = this.pos;
                                        this.pos = j212 - 1;
                                        UnsafeUtil.putByte(j212, (byte) ((codePoint6 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 >= 55296) {
                    j11 = this.pos;
                    if (j11 > this.bufferOffset + 1) {
                        this.pos = j11 - 1;
                        UnsafeUtil.putByte(j11, (byte) ((cCharAt3 & '?') | 128));
                        long j1118 = this.pos;
                        this.pos = j1118 - 1;
                        UnsafeUtil.putByte(j1118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        long j1119 = this.pos;
                        this.pos = j1119 - 1;
                        UnsafeUtil.putByte(j1119, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.pos > this.bufferOffset + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint7 = Character.toCodePoint(cCharAt, cCharAt3);
                                    long j11110 = this.pos;
                                    this.pos = j11110 - 1;
                                    UnsafeUtil.putByte(j11110, (byte) ((codePoint7 & 63) | 128));
                                    long j11111 = this.pos;
                                    this.pos = j11111 - 1;
                                    UnsafeUtil.putByte(j11111, (byte) (((codePoint7 >>> 6) & 63) | 128));
                                    long j213 = this.pos;
                                    this.pos = j213 - 1;
                                    UnsafeUtil.putByte(j213, (byte) (((codePoint7 >>> 12) & 63) | 128));
                                    long j214 = this.pos;
                                    this.pos = j214 - 1;
                                    UnsafeUtil.putByte(j214, (byte) ((codePoint7 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        requireSpace(length);
                        length++;
                    }
                } else {
                    j11 = this.pos;
                    if (j11 > this.bufferOffset + 1) {
                        this.pos = j11 - 1;
                        UnsafeUtil.putByte(j11, (byte) ((cCharAt3 & '?') | 128));
                        long j11112 = this.pos;
                        this.pos = j11112 - 1;
                        UnsafeUtil.putByte(j11112, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        long j11113 = this.pos;
                        this.pos = j11113 - 1;
                        UnsafeUtil.putByte(j11113, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.pos > this.bufferOffset + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint8 = Character.toCodePoint(cCharAt, cCharAt3);
                                    long j11114 = this.pos;
                                    this.pos = j11114 - 1;
                                    UnsafeUtil.putByte(j11114, (byte) ((codePoint8 & 63) | 128));
                                    long j11115 = this.pos;
                                    this.pos = j11115 - 1;
                                    UnsafeUtil.putByte(j11115, (byte) (((codePoint8 >>> 6) & 63) | 128));
                                    long j215 = this.pos;
                                    this.pos = j215 - 1;
                                    UnsafeUtil.putByte(j215, (byte) (((codePoint8 >>> 12) & 63) | 128));
                                    long j216 = this.pos;
                                    this.pos = j216 - 1;
                                    UnsafeUtil.putByte(j216, (byte) ((codePoint8 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        requireSpace(length);
                        length++;
                    }
                }
                length--;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                this.pos -= (long) iRemaining;
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(byteBuffer);
            }
        }
    }

    private static final class UnsafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        UnsafeHeapWriter(BufferAllocator bufferAllocator, int i11) {
            super(bufferAllocator, i11, null);
            nextBuffer();
        }

        private int arrayPos() {
            return (int) this.pos;
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeArrayOperations();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (i11 >>> 28));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((i11 >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((i11 >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (((i11 >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr5, j15, (byte) ((i11 & 127) | 128));
        }

        private void writeVarint32FourBytes(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (i11 >>> 21));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((i11 >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) (((i11 >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) ((i11 & 127) | 128));
        }

        private void writeVarint32OneByte(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) i11);
        }

        private void writeVarint32ThreeBytes(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (i11 >>> 14));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) (((i11 >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) ((i11 & 127) | 128));
        }

        private void writeVarint32TwoBytes(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) (i11 >>> 7));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) ((i11 & 127) | 128));
        }

        private void writeVarint64EightBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (j11 >>> 49));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((j11 >>> 42) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) (((j11 >>> 35) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) (((j11 >>> 28) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr5, j16, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr6, j17, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr7, j18, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr8, j19, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (j11 >>> 28));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr5, j16, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64FourBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (j11 >>> 21));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64NineBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (j11 >>> 56));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((j11 >>> 49) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) (((j11 >>> 42) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) (((j11 >>> 35) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr5, j16, (byte) (((j11 >>> 28) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr6, j17, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr7, j18, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr8, j19, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j21 = this.pos;
            this.pos = j21 - 1;
            UnsafeUtil.putByte(bArr9, j21, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64OneByte(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) j11);
        }

        private void writeVarint64SevenBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (j11 >>> 42));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((j11 >>> 35) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) (((j11 >>> 28) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr5, j16, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr6, j17, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr7, j18, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64SixBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (j11 >>> 35));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((j11 >>> 28) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr5, j16, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr6, j17, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64TenBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (j11 >>> 63));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((j11 >>> 56) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) (((j11 >>> 49) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) (((j11 >>> 42) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr5, j16, (byte) (((j11 >>> 35) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr6, j17, (byte) (((j11 >>> 28) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr7, j18, (byte) (((j11 >>> 21) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr8, j19, (byte) (((j11 >>> 14) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j21 = this.pos;
            this.pos = j21 - 1;
            UnsafeUtil.putByte(bArr9, j21, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr10 = this.buffer;
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.putByte(bArr10, j22, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (((int) j11) >>> 14));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((j11 >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) ((j11 & 127) | 128));
        }

        private void writeVarint64TwoBytes(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (j11 >>> 7));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) ((((int) j11) & 127) | 128));
        }

        int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.allocatedBuffer.position((arrayPos() - this.allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i11) {
            if (spaceLeft() < i11) {
                nextBuffer(i11);
            }
        }

        int spaceLeft() {
            return (int) (this.pos - this.offsetMinusOne);
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, b11);
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i11, boolean z11) {
            requireSpace(6);
            write(z11 ? (byte) 1 : (byte) 0);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i11, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i11, 2);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeEndGroup(int i11) {
            writeTag(i11, 4);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i11, int i12) {
            requireSpace(9);
            writeFixed32(i12);
            writeTag(i11, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i11, long j11) {
            requireSpace(13);
            writeFixed64(j11);
            writeTag(i11, 1);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i11, Object obj) {
            writeTag(i11, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i11, int i12) {
            requireSpace(15);
            writeInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i11, int i12) {
            if (i11 < 0 || i11 + i12 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            if (spaceLeft() >= i12) {
                this.pos -= (long) i12;
                System.arraycopy(bArr, i11, this.buffer, arrayPos() + 1, i12);
            } else {
                this.totalDoneBytes += i12;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i11, i12));
                nextBuffer();
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i11, Object obj) {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i11, int i12) {
            requireSpace(10);
            writeSInt32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i11, long j11) {
            requireSpace(15);
            writeSInt64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeStartGroup(int i11) {
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i11, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i11, int i12) {
            writeVarint32(WireFormat.makeTag(i11, i12));
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i11, int i12) {
            requireSpace(10);
            writeVarint32(i12);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i11, long j11) {
            requireSpace(15);
            writeVarint64(j11);
            writeTag(i11, 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i11) {
            if ((i11 & RangingPosition.RSSI_UNKNOWN) == 0) {
                writeVarint32OneByte(i11);
                return;
            }
            if ((i11 & (-16384)) == 0) {
                writeVarint32TwoBytes(i11);
                return;
            }
            if (((-2097152) & i11) == 0) {
                writeVarint32ThreeBytes(i11);
            } else if (((-268435456) & i11) == 0) {
                writeVarint32FourBytes(i11);
            } else {
                writeVarint32FiveBytes(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j11) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j11)) {
                case 1:
                    writeVarint64OneByte(j11);
                    break;
                case 2:
                    writeVarint64TwoBytes(j11);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j11);
                    break;
                case 4:
                    writeVarint64FourBytes(j11);
                    break;
                case 5:
                    writeVarint64FiveBytes(j11);
                    break;
                case 6:
                    writeVarint64SixBytes(j11);
                    break;
                case 7:
                    writeVarint64SevenBytes(j11);
                    break;
                case 8:
                    writeVarint64EightBytes(j11);
                    break;
                case 9:
                    writeVarint64NineBytes(j11);
                    break;
                case 10:
                    writeVarint64TenBytes(j11);
                    break;
            }
        }

        private void nextBuffer(int i11) {
            nextBuffer(newHeapBuffer(i11));
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i11, int i12) {
            if (i11 < 0 || i11 + i12 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            requireSpace(i12);
            this.pos -= (long) i12;
            System.arraycopy(bArr, i11, this.buffer, arrayPos() + 1, i12);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                long jArrayOffset = allocatedBuffer.arrayOffset();
                this.limit = ((long) allocatedBuffer.limit()) + jArrayOffset;
                long jPosition = jArrayOffset + ((long) allocatedBuffer.position());
                this.offset = jPosition;
                this.offsetMinusOne = jPosition - 1;
                long j11 = this.limit - 1;
                this.limitMinusOne = j11;
                this.pos = j11;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z11) {
            write(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i11) {
            byte[] bArr = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr, j11, (byte) ((i11 >> 24) & 255));
            byte[] bArr2 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr2, j12, (byte) ((i11 >> 16) & 255));
            byte[] bArr3 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr3, j13, (byte) ((i11 >> 8) & 255));
            byte[] bArr4 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr4, j14, (byte) (i11 & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j11) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (((int) (j11 >> 56)) & 255));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((int) (j11 >> 48)) & 255));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) (((int) (j11 >> 40)) & 255));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) (((int) (j11 >> 32)) & 255));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr5, j16, (byte) (((int) (j11 >> 24)) & 255));
            byte[] bArr6 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr6, j17, (byte) (((int) (j11 >> 16)) & 255));
            byte[] bArr7 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr7, j18, (byte) (((int) (j11 >> 8)) & 255));
            byte[] bArr8 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr8, j19, (byte) (((int) j11) & 255));
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i11, Object obj, Schema schema) {
            writeTag(i11, 4);
            schema.writeTo(obj, this);
            writeTag(i11, 3);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i11) {
            if (i11 >= 0) {
                writeVarint32(i11);
            } else {
                writeVarint64(i11);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i11) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i11));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j11) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j11));
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i11, Object obj, Schema schema) {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i11, 2);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0049  */
        /* JADX WARN: Code duplicated, block: B:19:0x004d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:22:0x0074  */
        /* JADX WARN: Code duplicated, block: B:24:0x0079  */
        /* JADX WARN: Code duplicated, block: B:26:0x007e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0087  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c1 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:37:0x011f  */
        /* JADX WARN: Code duplicated, block: B:43:0x0117 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0117 A[SYNTHETIC] */
        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
            long j11;
            char cCharAt;
            long j12;
            char cCharAt2;
            requireSpace(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt2 = str.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.buffer;
                long j13 = this.pos;
                this.pos = j13 - 1;
                UnsafeUtil.putByte(bArr, j13, (byte) cCharAt2);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char cCharAt3 = str.charAt(length);
                if (cCharAt3 < 128) {
                    long j14 = this.pos;
                    if (j14 > this.offsetMinusOne) {
                        byte[] bArr2 = this.buffer;
                        this.pos = j14 - 1;
                        UnsafeUtil.putByte(bArr2, j14, (byte) cCharAt3);
                    } else if (cCharAt3 < 2048) {
                        j12 = this.pos;
                        if (j12 > this.offset) {
                            byte[] bArr3 = this.buffer;
                            this.pos = j12 - 1;
                            UnsafeUtil.putByte(bArr3, j12, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr4 = this.buffer;
                            long j15 = this.pos;
                            this.pos = j15 - 1;
                            UnsafeUtil.putByte(bArr4, j15, (byte) ((cCharAt3 >>> 6) | 960));
                        } else if (cCharAt3 >= 55296 || 57343 < cCharAt3) {
                            j11 = this.pos;
                            if (j11 > this.offset + 1) {
                                byte[] bArr5 = this.buffer;
                                this.pos = j11 - 1;
                                UnsafeUtil.putByte(bArr5, j11, (byte) ((cCharAt3 & '?') | 128));
                                byte[] bArr6 = this.buffer;
                                long j16 = this.pos;
                                this.pos = j16 - 1;
                                UnsafeUtil.putByte(bArr6, j16, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                byte[] bArr7 = this.buffer;
                                long j17 = this.pos;
                                this.pos = j17 - 1;
                                UnsafeUtil.putByte(bArr7, j17, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.pos > this.offset + 2) {
                                    if (length != 0) {
                                        cCharAt = str.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt3);
                                            byte[] bArr8 = this.buffer;
                                            long j18 = this.pos;
                                            this.pos = j18 - 1;
                                            UnsafeUtil.putByte(bArr8, j18, (byte) ((codePoint & 63) | 128));
                                            byte[] bArr9 = this.buffer;
                                            long j19 = this.pos;
                                            this.pos = j19 - 1;
                                            UnsafeUtil.putByte(bArr9, j19, (byte) (((codePoint >>> 6) & 63) | 128));
                                            byte[] bArr10 = this.buffer;
                                            long j21 = this.pos;
                                            this.pos = j21 - 1;
                                            UnsafeUtil.putByte(bArr10, j21, (byte) (((codePoint >>> 12) & 63) | 128));
                                            byte[] bArr11 = this.buffer;
                                            long j22 = this.pos;
                                            this.pos = j22 - 1;
                                            UnsafeUtil.putByte(bArr11, j22, (byte) ((codePoint >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                        }
                                    }
                                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                                }
                                requireSpace(length);
                                length++;
                            }
                        } else {
                            if (this.pos > this.offset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint2 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr12 = this.buffer;
                                        long j110 = this.pos;
                                        this.pos = j110 - 1;
                                        UnsafeUtil.putByte(bArr12, j110, (byte) ((codePoint2 & 63) | 128));
                                        byte[] bArr13 = this.buffer;
                                        long j111 = this.pos;
                                        this.pos = j111 - 1;
                                        UnsafeUtil.putByte(bArr13, j111, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        byte[] bArr14 = this.buffer;
                                        long j23 = this.pos;
                                        this.pos = j23 - 1;
                                        UnsafeUtil.putByte(bArr14, j23, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        byte[] bArr15 = this.buffer;
                                        long j24 = this.pos;
                                        this.pos = j24 - 1;
                                        UnsafeUtil.putByte(bArr15, j24, (byte) ((codePoint2 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else if (cCharAt3 >= 55296) {
                        j11 = this.pos;
                        if (j11 > this.offset + 1) {
                            byte[] bArr16 = this.buffer;
                            this.pos = j11 - 1;
                            UnsafeUtil.putByte(bArr16, j11, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr17 = this.buffer;
                            long j112 = this.pos;
                            this.pos = j112 - 1;
                            UnsafeUtil.putByte(bArr17, j112, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr18 = this.buffer;
                            long j113 = this.pos;
                            this.pos = j113 - 1;
                            UnsafeUtil.putByte(bArr18, j113, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.offset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint3 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr19 = this.buffer;
                                        long j114 = this.pos;
                                        this.pos = j114 - 1;
                                        UnsafeUtil.putByte(bArr19, j114, (byte) ((codePoint3 & 63) | 128));
                                        byte[] bArr110 = this.buffer;
                                        long j115 = this.pos;
                                        this.pos = j115 - 1;
                                        UnsafeUtil.putByte(bArr110, j115, (byte) (((codePoint3 >>> 6) & 63) | 128));
                                        byte[] bArr111 = this.buffer;
                                        long j25 = this.pos;
                                        this.pos = j25 - 1;
                                        UnsafeUtil.putByte(bArr111, j25, (byte) (((codePoint3 >>> 12) & 63) | 128));
                                        byte[] bArr112 = this.buffer;
                                        long j26 = this.pos;
                                        this.pos = j26 - 1;
                                        UnsafeUtil.putByte(bArr112, j26, (byte) ((codePoint3 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else {
                        j11 = this.pos;
                        if (j11 > this.offset + 1) {
                            byte[] bArr113 = this.buffer;
                            this.pos = j11 - 1;
                            UnsafeUtil.putByte(bArr113, j11, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr114 = this.buffer;
                            long j116 = this.pos;
                            this.pos = j116 - 1;
                            UnsafeUtil.putByte(bArr114, j116, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr115 = this.buffer;
                            long j117 = this.pos;
                            this.pos = j117 - 1;
                            UnsafeUtil.putByte(bArr115, j117, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.offset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint4 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr116 = this.buffer;
                                        long j118 = this.pos;
                                        this.pos = j118 - 1;
                                        UnsafeUtil.putByte(bArr116, j118, (byte) ((codePoint4 & 63) | 128));
                                        byte[] bArr117 = this.buffer;
                                        long j119 = this.pos;
                                        this.pos = j119 - 1;
                                        UnsafeUtil.putByte(bArr117, j119, (byte) (((codePoint4 >>> 6) & 63) | 128));
                                        byte[] bArr118 = this.buffer;
                                        long j27 = this.pos;
                                        this.pos = j27 - 1;
                                        UnsafeUtil.putByte(bArr118, j27, (byte) (((codePoint4 >>> 12) & 63) | 128));
                                        byte[] bArr119 = this.buffer;
                                        long j28 = this.pos;
                                        this.pos = j28 - 1;
                                        UnsafeUtil.putByte(bArr119, j28, (byte) ((codePoint4 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 < 2048) {
                    j12 = this.pos;
                    if (j12 > this.offset) {
                        byte[] bArr20 = this.buffer;
                        this.pos = j12 - 1;
                        UnsafeUtil.putByte(bArr20, j12, (byte) ((cCharAt3 & '?') | 128));
                        byte[] bArr21 = this.buffer;
                        long j120 = this.pos;
                        this.pos = j120 - 1;
                        UnsafeUtil.putByte(bArr21, j120, (byte) ((cCharAt3 >>> 6) | 960));
                    } else if (cCharAt3 >= 55296) {
                        j11 = this.pos;
                        if (j11 > this.offset + 1) {
                            byte[] bArr1110 = this.buffer;
                            this.pos = j11 - 1;
                            UnsafeUtil.putByte(bArr1110, j11, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr1111 = this.buffer;
                            long j1110 = this.pos;
                            this.pos = j1110 - 1;
                            UnsafeUtil.putByte(bArr1111, j1110, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr1112 = this.buffer;
                            long j1111 = this.pos;
                            this.pos = j1111 - 1;
                            UnsafeUtil.putByte(bArr1112, j1111, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.offset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint5 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr1113 = this.buffer;
                                        long j1112 = this.pos;
                                        this.pos = j1112 - 1;
                                        UnsafeUtil.putByte(bArr1113, j1112, (byte) ((codePoint5 & 63) | 128));
                                        byte[] bArr1114 = this.buffer;
                                        long j1113 = this.pos;
                                        this.pos = j1113 - 1;
                                        UnsafeUtil.putByte(bArr1114, j1113, (byte) (((codePoint5 >>> 6) & 63) | 128));
                                        byte[] bArr1115 = this.buffer;
                                        long j29 = this.pos;
                                        this.pos = j29 - 1;
                                        UnsafeUtil.putByte(bArr1115, j29, (byte) (((codePoint5 >>> 12) & 63) | 128));
                                        byte[] bArr1116 = this.buffer;
                                        long j210 = this.pos;
                                        this.pos = j210 - 1;
                                        UnsafeUtil.putByte(bArr1116, j210, (byte) ((codePoint5 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    } else {
                        j11 = this.pos;
                        if (j11 > this.offset + 1) {
                            byte[] bArr1117 = this.buffer;
                            this.pos = j11 - 1;
                            UnsafeUtil.putByte(bArr1117, j11, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr1118 = this.buffer;
                            long j1114 = this.pos;
                            this.pos = j1114 - 1;
                            UnsafeUtil.putByte(bArr1118, j1114, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr1119 = this.buffer;
                            long j1115 = this.pos;
                            this.pos = j1115 - 1;
                            UnsafeUtil.putByte(bArr1119, j1115, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.pos > this.offset + 2) {
                                if (length != 0) {
                                    cCharAt = str.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint6 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr11110 = this.buffer;
                                        long j1116 = this.pos;
                                        this.pos = j1116 - 1;
                                        UnsafeUtil.putByte(bArr11110, j1116, (byte) ((codePoint6 & 63) | 128));
                                        byte[] bArr11111 = this.buffer;
                                        long j1117 = this.pos;
                                        this.pos = j1117 - 1;
                                        UnsafeUtil.putByte(bArr11111, j1117, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                        byte[] bArr11112 = this.buffer;
                                        long j211 = this.pos;
                                        this.pos = j211 - 1;
                                        UnsafeUtil.putByte(bArr11112, j211, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                        byte[] bArr11113 = this.buffer;
                                        long j212 = this.pos;
                                        this.pos = j212 - 1;
                                        UnsafeUtil.putByte(bArr11113, j212, (byte) ((codePoint6 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                    }
                                }
                                throw new Utf8.UnpairedSurrogateException(length - 1, length);
                            }
                            requireSpace(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 >= 55296) {
                    j11 = this.pos;
                    if (j11 > this.offset + 1) {
                        byte[] bArr11114 = this.buffer;
                        this.pos = j11 - 1;
                        UnsafeUtil.putByte(bArr11114, j11, (byte) ((cCharAt3 & '?') | 128));
                        byte[] bArr11115 = this.buffer;
                        long j1118 = this.pos;
                        this.pos = j1118 - 1;
                        UnsafeUtil.putByte(bArr11115, j1118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        byte[] bArr11116 = this.buffer;
                        long j1119 = this.pos;
                        this.pos = j1119 - 1;
                        UnsafeUtil.putByte(bArr11116, j1119, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.pos > this.offset + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint7 = Character.toCodePoint(cCharAt, cCharAt3);
                                    byte[] bArr11117 = this.buffer;
                                    long j11110 = this.pos;
                                    this.pos = j11110 - 1;
                                    UnsafeUtil.putByte(bArr11117, j11110, (byte) ((codePoint7 & 63) | 128));
                                    byte[] bArr11118 = this.buffer;
                                    long j11111 = this.pos;
                                    this.pos = j11111 - 1;
                                    UnsafeUtil.putByte(bArr11118, j11111, (byte) (((codePoint7 >>> 6) & 63) | 128));
                                    byte[] bArr11119 = this.buffer;
                                    long j213 = this.pos;
                                    this.pos = j213 - 1;
                                    UnsafeUtil.putByte(bArr11119, j213, (byte) (((codePoint7 >>> 12) & 63) | 128));
                                    byte[] bArr111110 = this.buffer;
                                    long j214 = this.pos;
                                    this.pos = j214 - 1;
                                    UnsafeUtil.putByte(bArr111110, j214, (byte) ((codePoint7 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        requireSpace(length);
                        length++;
                    }
                } else {
                    j11 = this.pos;
                    if (j11 > this.offset + 1) {
                        byte[] bArr111111 = this.buffer;
                        this.pos = j11 - 1;
                        UnsafeUtil.putByte(bArr111111, j11, (byte) ((cCharAt3 & '?') | 128));
                        byte[] bArr111112 = this.buffer;
                        long j11112 = this.pos;
                        this.pos = j11112 - 1;
                        UnsafeUtil.putByte(bArr111112, j11112, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        byte[] bArr111113 = this.buffer;
                        long j11113 = this.pos;
                        this.pos = j11113 - 1;
                        UnsafeUtil.putByte(bArr111113, j11113, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.pos > this.offset + 2) {
                            if (length != 0) {
                                cCharAt = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint8 = Character.toCodePoint(cCharAt, cCharAt3);
                                    byte[] bArr111114 = this.buffer;
                                    long j11114 = this.pos;
                                    this.pos = j11114 - 1;
                                    UnsafeUtil.putByte(bArr111114, j11114, (byte) ((codePoint8 & 63) | 128));
                                    byte[] bArr111115 = this.buffer;
                                    long j11115 = this.pos;
                                    this.pos = j11115 - 1;
                                    UnsafeUtil.putByte(bArr111115, j11115, (byte) (((codePoint8 >>> 6) & 63) | 128));
                                    byte[] bArr111116 = this.buffer;
                                    long j215 = this.pos;
                                    this.pos = j215 - 1;
                                    UnsafeUtil.putByte(bArr111116, j215, (byte) (((codePoint8 >>> 12) & 63) | 128));
                                    byte[] bArr111117 = this.buffer;
                                    long j216 = this.pos;
                                    this.pos = j216 - 1;
                                    UnsafeUtil.putByte(bArr111117, j216, (byte) ((codePoint8 >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                }
                            }
                            throw new Utf8.UnpairedSurrogateException(length - 1, length);
                        }
                        requireSpace(length);
                        length++;
                    }
                }
                length--;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            requireSpace(iRemaining);
            this.pos -= (long) iRemaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, iRemaining);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            this.pos -= (long) iRemaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, iRemaining);
        }
    }

    /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int i11, AnonymousClass1 anonymousClass1) {
        this(bufferAllocator, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long j11) {
        byte b11;
        if (((-128) & j11) == 0) {
            return (byte) 1;
        }
        if (j11 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j11) != 0) {
            b11 = (byte) 6;
            j11 >>>= 28;
        } else {
            b11 = 2;
        }
        if (((-2097152) & j11) != 0) {
            b11 = (byte) (b11 + 2);
            j11 >>>= 14;
        }
        return (j11 & (-16384)) != 0 ? (byte) (b11 + 1) : b11;
    }

    static boolean isUnsafeDirectSupported() {
        return UnsafeDirectWriter.isSupported();
    }

    static boolean isUnsafeHeapSupported() {
        return UnsafeHeapWriter.isSupported();
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator) {
        return newDirectInstance(bufferAllocator, 4096);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator) {
        return newHeapInstance(bufferAllocator, 4096);
    }

    static BinaryWriter newSafeDirectInstance(BufferAllocator bufferAllocator, int i11) {
        return new SafeDirectWriter(bufferAllocator, i11);
    }

    static BinaryWriter newSafeHeapInstance(BufferAllocator bufferAllocator, int i11) {
        return new SafeHeapWriter(bufferAllocator, i11);
    }

    static BinaryWriter newUnsafeDirectInstance(BufferAllocator bufferAllocator, int i11) {
        if (isUnsafeDirectSupported()) {
            return new UnsafeDirectWriter(bufferAllocator, i11);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    static BinaryWriter newUnsafeHeapInstance(BufferAllocator bufferAllocator, int i11) {
        if (isUnsafeHeapSupported()) {
            return new UnsafeHeapWriter(bufferAllocator, i11);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private void writeBoolList_Internal(int i11, List<Boolean> list, boolean z11) {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(i11, list.get(size).booleanValue());
            }
            return;
        }
        requireSpace(list.size() + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(list.get(size2).booleanValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeDoubleList_Internal(int i11, List<Double> list, boolean z11) {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeDouble(i11, list.get(size).doubleValue());
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeFixed32List_Internal(int i11, List<Integer> list, boolean z11) {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(i11, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeFixed64List_Internal(int i11, List<Long> list, boolean z11) {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(i11, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeFloatList_Internal(int i11, List<Float> list, boolean z11) {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFloat(i11, list.get(size).floatValue());
            }
            return;
        }
        requireSpace((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeInt32List_Internal(int i11, List<Integer> list, boolean z11) {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(i11, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeLazyString(int i11, Object obj) {
        if (obj instanceof String) {
            writeString(i11, (String) obj);
        } else {
            writeBytes(i11, (ByteString) obj);
        }
    }

    static final void writeMapEntryField(Writer writer, int i11, WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(i11, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.writeFixed32(i11, ((Integer) obj).intValue());
                return;
            case 3:
                writer.writeFixed64(i11, ((Long) obj).longValue());
                return;
            case 4:
                writer.writeInt32(i11, ((Integer) obj).intValue());
                return;
            case 5:
                writer.writeInt64(i11, ((Long) obj).longValue());
                return;
            case 6:
                writer.writeSFixed32(i11, ((Integer) obj).intValue());
                return;
            case 7:
                writer.writeSFixed64(i11, ((Long) obj).longValue());
                return;
            case 8:
                writer.writeSInt32(i11, ((Integer) obj).intValue());
                return;
            case 9:
                writer.writeSInt64(i11, ((Long) obj).longValue());
                return;
            case 10:
                writer.writeString(i11, (String) obj);
                return;
            case 11:
                writer.writeUInt32(i11, ((Integer) obj).intValue());
                return;
            case 12:
                writer.writeUInt64(i11, ((Long) obj).longValue());
                return;
            case 13:
                writer.writeFloat(i11, ((Float) obj).floatValue());
                return;
            case 14:
                writer.writeDouble(i11, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.writeMessage(i11, obj);
                return;
            case 16:
                writer.writeBytes(i11, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof Internal.EnumLite) {
                    writer.writeEnum(i11, ((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.writeEnum(i11, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private void writeSInt32List_Internal(int i11, List<Integer> list, boolean z11) {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(i11, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeSInt64List_Internal(int i11, List<Long> list, boolean z11) {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(i11, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeUInt32List_Internal(int i11, List<Integer> list, boolean z11) {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt32(i11, list.get(size).intValue());
            }
            return;
        }
        requireSpace((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    private void writeUInt64List_Internal(int i11, List<Long> list, boolean z11) {
        if (!z11) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt64(i11, list.get(size).longValue());
            }
            return;
        }
        requireSpace((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i11, 2);
    }

    @CanIgnoreReturnValue
    public final Queue<AllocatedBuffer> complete() {
        finishCurrentBuffer();
        return this.buffers;
    }

    @Override // com.google.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.DESCENDING;
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    final AllocatedBuffer newDirectBuffer() {
        return this.alloc.allocateDirectBuffer(this.chunkSize);
    }

    final AllocatedBuffer newHeapBuffer() {
        return this.alloc.allocateHeapBuffer(this.chunkSize);
    }

    abstract void requireSpace(int i11);

    abstract void writeBool(boolean z11);

    @Override // com.google.protobuf.Writer
    public final void writeBoolList(int i11, List<Boolean> list, boolean z11) {
        if (list instanceof BooleanArrayList) {
            writeBoolList_Internal(i11, (BooleanArrayList) list, z11);
        } else {
            writeBoolList_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeBytesList(int i11, List<ByteString> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(i11, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeDouble(int i11, double d11) {
        writeFixed64(i11, Double.doubleToRawLongBits(d11));
    }

    @Override // com.google.protobuf.Writer
    public final void writeDoubleList(int i11, List<Double> list, boolean z11) {
        if (list instanceof DoubleArrayList) {
            writeDoubleList_Internal(i11, (DoubleArrayList) list, z11);
        } else {
            writeDoubleList_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnum(int i11, int i12) {
        writeInt32(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnumList(int i11, List<Integer> list, boolean z11) {
        writeInt32List(i11, list, z11);
    }

    abstract void writeFixed32(int i11);

    @Override // com.google.protobuf.Writer
    public final void writeFixed32List(int i11, List<Integer> list, boolean z11) {
        if (list instanceof IntArrayList) {
            writeFixed32List_Internal(i11, (IntArrayList) list, z11);
        } else {
            writeFixed32List_Internal(i11, list, z11);
        }
    }

    abstract void writeFixed64(long j11);

    @Override // com.google.protobuf.Writer
    public final void writeFixed64List(int i11, List<Long> list, boolean z11) {
        if (list instanceof LongArrayList) {
            writeFixed64List_Internal(i11, (LongArrayList) list, z11);
        } else {
            writeFixed64List_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloat(int i11, float f11) {
        writeFixed32(i11, Float.floatToRawIntBits(f11));
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloatList(int i11, List<Float> list, boolean z11) {
        if (list instanceof FloatArrayList) {
            writeFloatList_Internal(i11, (FloatArrayList) list, z11);
        } else {
            writeFloatList_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int i11, List<?> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i11, list.get(size));
        }
    }

    abstract void writeInt32(int i11);

    @Override // com.google.protobuf.Writer
    public final void writeInt32List(int i11, List<Integer> list, boolean z11) {
        if (list instanceof IntArrayList) {
            writeInt32List_Internal(i11, (IntArrayList) list, z11);
        } else {
            writeInt32List_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64(int i11, long j11) {
        writeUInt64(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64List(int i11, List<Long> list, boolean z11) {
        writeUInt64List(i11, list, z11);
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void writeMap(int i11, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            writeMapEntryField(this, 2, metadata.valueType, entry.getValue());
            writeMapEntryField(this, 1, metadata.keyType, entry.getKey());
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageList(int i11, List<?> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i11, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int i11, Object obj) {
        writeTag(1, 4);
        if (obj instanceof ByteString) {
            writeBytes(3, (ByteString) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i11);
        writeTag(1, 3);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32(int i11, int i12) {
        writeFixed32(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32List(int i11, List<Integer> list, boolean z11) {
        writeFixed32List(i11, list, z11);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64(int i11, long j11) {
        writeFixed64(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64List(int i11, List<Long> list, boolean z11) {
        writeFixed64List(i11, list, z11);
    }

    abstract void writeSInt32(int i11);

    @Override // com.google.protobuf.Writer
    public final void writeSInt32List(int i11, List<Integer> list, boolean z11) {
        if (list instanceof IntArrayList) {
            writeSInt32List_Internal(i11, (IntArrayList) list, z11);
        } else {
            writeSInt32List_Internal(i11, list, z11);
        }
    }

    abstract void writeSInt64(long j11);

    @Override // com.google.protobuf.Writer
    public final void writeSInt64List(int i11, List<Long> list, boolean z11) {
        if (list instanceof LongArrayList) {
            writeSInt64List_Internal(i11, (LongArrayList) list, z11);
        } else {
            writeSInt64List_Internal(i11, list, z11);
        }
    }

    abstract void writeString(String str);

    @Override // com.google.protobuf.Writer
    public final void writeStringList(int i11, List<String> list) {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(i11, list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeLazyString(i11, lazyStringList.getRaw(size2));
        }
    }

    abstract void writeTag(int i11, int i12);

    @Override // com.google.protobuf.Writer
    public final void writeUInt32List(int i11, List<Integer> list, boolean z11) {
        if (list instanceof IntArrayList) {
            writeUInt32List_Internal(i11, (IntArrayList) list, z11);
        } else {
            writeUInt32List_Internal(i11, list, z11);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt64List(int i11, List<Long> list, boolean z11) {
        if (list instanceof LongArrayList) {
            writeUInt64List_Internal(i11, (LongArrayList) list, z11);
        } else {
            writeUInt64List_Internal(i11, list, z11);
        }
    }

    abstract void writeVarint32(int i11);

    abstract void writeVarint64(long j11);

    private BinaryWriter(BufferAllocator bufferAllocator, int i11) {
        this.buffers = new ArrayDeque<>(4);
        if (i11 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.alloc = (BufferAllocator) Internal.checkNotNull(bufferAllocator, "alloc");
        this.chunkSize = i11;
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator, int i11) {
        return isUnsafeDirectSupported() ? newUnsafeDirectInstance(bufferAllocator, i11) : newSafeDirectInstance(bufferAllocator, i11);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator, int i11) {
        return isUnsafeHeapSupported() ? newUnsafeHeapInstance(bufferAllocator, i11) : newSafeHeapInstance(bufferAllocator, i11);
    }

    final AllocatedBuffer newDirectBuffer(int i11) {
        return this.alloc.allocateDirectBuffer(Math.max(i11, this.chunkSize));
    }

    final AllocatedBuffer newHeapBuffer(int i11) {
        return this.alloc.allocateHeapBuffer(Math.max(i11, this.chunkSize));
    }

    @Override // com.google.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int i11, List<?> list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i11, list.get(size), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageList(int i11, List<?> list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i11, list.get(size), schema);
        }
    }

    private void writeBoolList_Internal(int i11, BooleanArrayList booleanArrayList, boolean z11) {
        if (z11) {
            requireSpace(booleanArrayList.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                writeBool(booleanArrayList.getBoolean(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            writeBool(i11, booleanArrayList.getBoolean(size2));
        }
    }

    private void writeDoubleList_Internal(int i11, DoubleArrayList doubleArrayList, boolean z11) {
        if (z11) {
            requireSpace((doubleArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(Double.doubleToRawLongBits(doubleArrayList.getDouble(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            writeDouble(i11, doubleArrayList.getDouble(size2));
        }
    }

    private void writeFixed32List_Internal(int i11, IntArrayList intArrayList, boolean z11) {
        if (z11) {
            requireSpace((intArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed32(i11, intArrayList.getInt(size2));
        }
    }

    private void writeFixed64List_Internal(int i11, LongArrayList longArrayList, boolean z11) {
        if (z11) {
            requireSpace((longArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed64(i11, longArrayList.getLong(size2));
        }
    }

    private void writeFloatList_Internal(int i11, FloatArrayList floatArrayList, boolean z11) {
        if (z11) {
            requireSpace((floatArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(Float.floatToRawIntBits(floatArrayList.getFloat(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            writeFloat(i11, floatArrayList.getFloat(size2));
        }
    }

    private void writeInt32List_Internal(int i11, IntArrayList intArrayList, boolean z11) {
        if (z11) {
            requireSpace((intArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeInt32(i11, intArrayList.getInt(size2));
        }
    }

    private void writeSInt32List_Internal(int i11, IntArrayList intArrayList, boolean z11) {
        if (z11) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeSInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt32(i11, intArrayList.getInt(size2));
        }
    }

    private void writeSInt64List_Internal(int i11, LongArrayList longArrayList, boolean z11) {
        if (z11) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeSInt64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt64(i11, longArrayList.getLong(size2));
        }
    }

    private void writeUInt32List_Internal(int i11, IntArrayList intArrayList, boolean z11) {
        if (z11) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeVarint32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt32(i11, intArrayList.getInt(size2));
        }
    }

    private void writeUInt64List_Internal(int i11, LongArrayList longArrayList, boolean z11) {
        if (z11) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeVarint64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i11, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt64(i11, longArrayList.getLong(size2));
        }
    }
}
