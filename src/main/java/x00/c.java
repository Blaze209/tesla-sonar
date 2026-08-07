package x00;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lx00/c;", "", "<init>", "()V", "Ljava/nio/channels/FileChannel;", "inputFileChannel", "outputFileChannel", "", "a", "(Ljava/nio/channels/FileChannel;Ljava/nio/channels/FileChannel;)Z", "Ljava/io/Closeable;", "closeable", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/io/Closeable;)V", "Ljava/nio/ByteBuffer;", "buffer", "b", "(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;)Z", "", "position", "c", "(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;J)Z", "Ljava/io/File;", "in", "out", "e", "(Ljava/io/File;Ljava/io/File;)Z", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f122515a = new c();

    private c() {
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0198 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117 A[LOOP:1: B:51:0x0117->B:58:0x013e, LOOP_START, PHI: r2 r7
      0x0117: PHI (r2v3 int) = (r2v0 int), (r2v23 int) binds: [B:50:0x0115, B:58:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r7v7 long) = (r7v6 long), (r7v14 long) binds: [B:50:0x0115, B:58:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    /* JADX WARN: Code duplicated, block: B:61:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x0160  */
    /* JADX WARN: Code duplicated, block: B:65:0x0170  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:71:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:85:0x01be A[LOOP:3: B:84:0x01bc->B:85:0x01be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:97:0x020e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0216  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    private final boolean a(FileChannel inputFileChannel, FileChannel outputFileChannel) throws Exception {
        boolean z11;
        int iB;
        long j11;
        long size;
        ByteBuffer byteBufferOrder;
        int iPosition;
        int i11;
        long j12;
        int iA;
        ?? r11;
        ?? r12;
        int i12;
        int i13;
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long jC = 0;
        ByteBuffer byteBuffer = null;
        long jPosition = 0;
        int i14 = 0;
        while (true) {
            s.h(byteBufferOrder2);
            if (b(inputFileChannel, byteBufferOrder2)) {
                jC = b.c(byteBufferOrder2.getInt());
                i14 = byteBufferOrder2.getInt();
                if (i14 == w00.a.e()) {
                    int iB2 = b.b(jC);
                    ByteBuffer byteBufferOrder3 = ByteBuffer.allocate(iB2).order(ByteOrder.BIG_ENDIAN);
                    byteBufferOrder2.rewind();
                    byteBufferOrder3.put(byteBufferOrder2);
                    if (inputFileChannel.read(byteBufferOrder3) < iB2 - 8) {
                        byteBuffer = byteBufferOrder3;
                        z11 = false;
                        if (i14 != w00.a.h()) {
                            Log.wtf("StreamableVideo", "The last atom in the file was not a 'moov' atom");
                            return z11;
                        }
                        iB = b.b(jC);
                        j11 = iB;
                        size = inputFileChannel.size() - j11;
                        byteBufferOrder = ByteBuffer.allocate(iB).order(ByteOrder.BIG_ENDIAN);
                        if (!c(inputFileChannel, byteBufferOrder, size)) {
                            throw new Exception("Failed to read 'moov' atom");
                        }
                        if (byteBufferOrder.getInt(12) == w00.a.b()) {
                            throw new Exception("This utility does not support compressed 'moov' atoms yet");
                        }
                        for (int i15 = 8; byteBufferOrder.remaining() >= i15; i15 = 8) {
                            iPosition = byteBufferOrder.position();
                            i11 = byteBufferOrder.getInt(iPosition + 4);
                            if (i11 != w00.a.l() || i11 == w00.a.c()) {
                                j12 = size;
                                if (b.c(byteBufferOrder.getInt(iPosition)) > byteBufferOrder.remaining()) {
                                    throw new Exception("Bad atom size");
                                }
                                byteBufferOrder.position(iPosition + 12);
                                if (byteBufferOrder.remaining() < 4) {
                                    throw new Exception("Malformed atom");
                                }
                                iA = b.a(byteBufferOrder.getInt());
                                if (i11 == w00.a.l()) {
                                    Log.i("StreamableVideo", "Patching 'stco' atom...");
                                    if (byteBufferOrder.remaining() < iA * 4) {
                                        throw new Exception("Bad atom size/element count");
                                    }
                                    for (r12 = z11; r12 < iA; r12++) {
                                        i12 = byteBufferOrder.getInt(byteBufferOrder.position());
                                        i13 = i12 + iB;
                                        if (i12 >= 0 && i13 >= 0) {
                                            throw new Exception("This is a bug in the original 'qt-faststart.c': 'stco' atom should be extended to 'co64' atom as the new offset value overflows 'uint32', but it is not implemented.");
                                        }
                                        byteBufferOrder.putInt(i13);
                                    }
                                } else if (i11 == w00.a.c()) {
                                    Log.wtf("StreamableVideo", "Patching 'co64' atom...");
                                    if (byteBufferOrder.remaining() < iA * 8) {
                                        throw new Exception("Bad atom size/element count");
                                    }
                                    for (r11 = z11; r11 < iA; r11++) {
                                        byteBufferOrder.putLong(byteBufferOrder.getLong(byteBufferOrder.position()) + j11);
                                    }
                                }
                                size = j12;
                            } else {
                                byteBufferOrder.position(byteBufferOrder.position() + 1);
                            }
                        }
                        long j13 = size;
                        inputFileChannel.position(jPosition);
                        if (byteBuffer != null) {
                            Log.i("StreamableVideo", "Writing 'ftyp' atom...");
                            byteBuffer.rewind();
                            outputFileChannel.write(byteBuffer);
                        }
                        Log.i("StreamableVideo", "Writing 'moov' atom...");
                        byteBufferOrder.rewind();
                        outputFileChannel.write(byteBufferOrder);
                        Log.i("StreamableVideo", "Copying the rest of the file...");
                        inputFileChannel.transferTo(jPosition, j13 - jPosition, outputFileChannel);
                        return true;
                    }
                    byteBufferOrder3.flip();
                    jPosition = inputFileChannel.position();
                    h0 h0Var = h0.f84049a;
                    byteBuffer = byteBufferOrder3;
                    z11 = false;
                } else {
                    if (jC == 1) {
                        byteBufferOrder2.clear();
                        if (b(inputFileChannel, byteBufferOrder2)) {
                            jC = b.d(byteBufferOrder2.getLong());
                            z11 = false;
                            inputFileChannel.position((inputFileChannel.position() + jC) - ((long) 16));
                        }
                    } else {
                        z11 = false;
                        inputFileChannel.position((inputFileChannel.position() + jC) - ((long) 8));
                    }
                    byteBuffer = byteBuffer;
                }
                if (i14 != w00.a.d() && i14 != w00.a.f() && i14 != w00.a.g() && i14 != w00.a.h() && i14 != w00.a.j() && i14 != w00.a.k() && i14 != w00.a.n() && i14 != w00.a.i() && i14 != w00.a.m() && i14 != w00.a.e()) {
                    Log.wtf("StreamableVideo", "Encountered a non-QT top-level atom (Is this a QuickTime file?)");
                } else if (jC < 8) {
                }
                if (i14 != w00.a.h()) {
                    Log.wtf("StreamableVideo", "The last atom in the file was not a 'moov' atom");
                    return z11;
                }
                iB = b.b(jC);
                j11 = iB;
                size = inputFileChannel.size() - j11;
                byteBufferOrder = ByteBuffer.allocate(iB).order(ByteOrder.BIG_ENDIAN);
                if (!c(inputFileChannel, byteBufferOrder, size)) {
                    throw new Exception("Failed to read 'moov' atom");
                }
                if (byteBufferOrder.getInt(12) == w00.a.b()) {
                    throw new Exception("This utility does not support compressed 'moov' atoms yet");
                }
                while (byteBufferOrder.remaining() >= i15) {
                    iPosition = byteBufferOrder.position();
                    i11 = byteBufferOrder.getInt(iPosition + 4);
                    if (i11 != w00.a.l()) {
                        j12 = size;
                        if (b.c(byteBufferOrder.getInt(iPosition)) > byteBufferOrder.remaining()) {
                            throw new Exception("Bad atom size");
                        }
                        byteBufferOrder.position(iPosition + 12);
                        if (byteBufferOrder.remaining() < 4) {
                            throw new Exception("Malformed atom");
                        }
                        iA = b.a(byteBufferOrder.getInt());
                        if (i11 == w00.a.l()) {
                            Log.i("StreamableVideo", "Patching 'stco' atom...");
                            if (byteBufferOrder.remaining() < iA * 4) {
                                throw new Exception("Bad atom size/element count");
                            }
                            while (r12 < iA) {
                                i12 = byteBufferOrder.getInt(byteBufferOrder.position());
                                i13 = i12 + iB;
                                if (i12 >= 0) {
                                }
                                byteBufferOrder.putInt(i13);
                            }
                        } else if (i11 == w00.a.c()) {
                            Log.wtf("StreamableVideo", "Patching 'co64' atom...");
                            if (byteBufferOrder.remaining() < iA * 8) {
                                throw new Exception("Bad atom size/element count");
                            }
                            while (r11 < iA) {
                                byteBufferOrder.putLong(byteBufferOrder.getLong(byteBufferOrder.position()) + j11);
                            }
                        }
                        size = j12;
                    } else {
                        j12 = size;
                        if (b.c(byteBufferOrder.getInt(iPosition)) > byteBufferOrder.remaining()) {
                            throw new Exception("Bad atom size");
                        }
                        byteBufferOrder.position(iPosition + 12);
                        if (byteBufferOrder.remaining() < 4) {
                            throw new Exception("Malformed atom");
                        }
                        iA = b.a(byteBufferOrder.getInt());
                        if (i11 == w00.a.l()) {
                            Log.i("StreamableVideo", "Patching 'stco' atom...");
                            if (byteBufferOrder.remaining() < iA * 4) {
                                throw new Exception("Bad atom size/element count");
                            }
                            while (r12 < iA) {
                                i12 = byteBufferOrder.getInt(byteBufferOrder.position());
                                i13 = i12 + iB;
                                if (i12 >= 0) {
                                }
                                byteBufferOrder.putInt(i13);
                            }
                        } else if (i11 == w00.a.c()) {
                            Log.wtf("StreamableVideo", "Patching 'co64' atom...");
                            if (byteBufferOrder.remaining() < iA * 8) {
                                throw new Exception("Bad atom size/element count");
                            }
                            while (r11 < iA) {
                                byteBufferOrder.putLong(byteBufferOrder.getLong(byteBufferOrder.position()) + j11);
                            }
                        }
                        size = j12;
                    }
                }
                long j14 = size;
                inputFileChannel.position(jPosition);
                if (byteBuffer != null) {
                    Log.i("StreamableVideo", "Writing 'ftyp' atom...");
                    byteBuffer.rewind();
                    outputFileChannel.write(byteBuffer);
                }
                Log.i("StreamableVideo", "Writing 'moov' atom...");
                byteBufferOrder.rewind();
                outputFileChannel.write(byteBufferOrder);
                Log.i("StreamableVideo", "Copying the rest of the file...");
                inputFileChannel.transferTo(jPosition, j14 - jPosition, outputFileChannel);
                return true;
            }
            z11 = false;
            if (i14 != w00.a.h()) {
                Log.wtf("StreamableVideo", "The last atom in the file was not a 'moov' atom");
                return z11;
            }
            iB = b.b(jC);
            j11 = iB;
            size = inputFileChannel.size() - j11;
            byteBufferOrder = ByteBuffer.allocate(iB).order(ByteOrder.BIG_ENDIAN);
            if (!c(inputFileChannel, byteBufferOrder, size)) {
                throw new Exception("Failed to read 'moov' atom");
            }
            if (byteBufferOrder.getInt(12) == w00.a.b()) {
                throw new Exception("This utility does not support compressed 'moov' atoms yet");
            }
            while (byteBufferOrder.remaining() >= i15) {
                iPosition = byteBufferOrder.position();
                i11 = byteBufferOrder.getInt(iPosition + 4);
                if (i11 != w00.a.l()) {
                    j12 = size;
                    if (b.c(byteBufferOrder.getInt(iPosition)) > byteBufferOrder.remaining()) {
                        throw new Exception("Bad atom size");
                    }
                    byteBufferOrder.position(iPosition + 12);
                    if (byteBufferOrder.remaining() < 4) {
                        throw new Exception("Malformed atom");
                    }
                    iA = b.a(byteBufferOrder.getInt());
                    if (i11 == w00.a.l()) {
                        Log.i("StreamableVideo", "Patching 'stco' atom...");
                        if (byteBufferOrder.remaining() < iA * 4) {
                            throw new Exception("Bad atom size/element count");
                        }
                        while (r12 < iA) {
                            i12 = byteBufferOrder.getInt(byteBufferOrder.position());
                            i13 = i12 + iB;
                            if (i12 >= 0) {
                            }
                            byteBufferOrder.putInt(i13);
                        }
                    } else if (i11 == w00.a.c()) {
                        Log.wtf("StreamableVideo", "Patching 'co64' atom...");
                        if (byteBufferOrder.remaining() < iA * 8) {
                            throw new Exception("Bad atom size/element count");
                        }
                        while (r11 < iA) {
                            byteBufferOrder.putLong(byteBufferOrder.getLong(byteBufferOrder.position()) + j11);
                        }
                    }
                    size = j12;
                } else {
                    j12 = size;
                    if (b.c(byteBufferOrder.getInt(iPosition)) > byteBufferOrder.remaining()) {
                        throw new Exception("Bad atom size");
                    }
                    byteBufferOrder.position(iPosition + 12);
                    if (byteBufferOrder.remaining() < 4) {
                        throw new Exception("Malformed atom");
                    }
                    iA = b.a(byteBufferOrder.getInt());
                    if (i11 == w00.a.l()) {
                        Log.i("StreamableVideo", "Patching 'stco' atom...");
                        if (byteBufferOrder.remaining() < iA * 4) {
                            throw new Exception("Bad atom size/element count");
                        }
                        while (r12 < iA) {
                            i12 = byteBufferOrder.getInt(byteBufferOrder.position());
                            i13 = i12 + iB;
                            if (i12 >= 0) {
                            }
                            byteBufferOrder.putInt(i13);
                        }
                    } else if (i11 == w00.a.c()) {
                        Log.wtf("StreamableVideo", "Patching 'co64' atom...");
                        if (byteBufferOrder.remaining() < iA * 8) {
                            throw new Exception("Bad atom size/element count");
                        }
                        while (r11 < iA) {
                            byteBufferOrder.putLong(byteBufferOrder.getLong(byteBufferOrder.position()) + j11);
                        }
                    }
                    size = j12;
                }
            }
            long j15 = size;
            inputFileChannel.position(jPosition);
            if (byteBuffer != null) {
                Log.i("StreamableVideo", "Writing 'ftyp' atom...");
                byteBuffer.rewind();
                outputFileChannel.write(byteBuffer);
            }
            Log.i("StreamableVideo", "Writing 'moov' atom...");
            byteBufferOrder.rewind();
            outputFileChannel.write(byteBufferOrder);
            Log.i("StreamableVideo", "Copying the rest of the file...");
            inputFileChannel.transferTo(jPosition, j15 - jPosition, outputFileChannel);
            return true;
        }
    }

    private final boolean b(FileChannel inputFileChannel, ByteBuffer buffer) throws IOException {
        buffer.clear();
        int i11 = inputFileChannel.read(buffer);
        buffer.flip();
        return i11 == buffer.capacity();
    }

    private final boolean c(FileChannel inputFileChannel, ByteBuffer buffer, long position) throws IOException {
        buffer.clear();
        int i11 = inputFileChannel.read(buffer, position);
        buffer.flip();
        return i11 == buffer.capacity();
    }

    private final void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.wtf("StreamableVideo", "Failed to close file: ");
            }
        }
    }

    public final boolean e(File in2, File out) throws Throwable {
        FileOutputStream fileOutputStream;
        s.k(out, "out");
        Closeable closeable = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(in2);
            try {
                FileChannel channel = fileInputStream.getChannel();
                fileOutputStream = new FileOutputStream(out);
                try {
                    FileChannel channel2 = fileOutputStream.getChannel();
                    s.h(channel);
                    s.h(channel2);
                    boolean zA = a(channel, channel2);
                    d(fileInputStream);
                    d(fileOutputStream);
                    if (!zA) {
                        out.delete();
                    }
                    return zA;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = fileInputStream;
                    d(closeable);
                    d(fileOutputStream);
                    out.delete();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }
}
