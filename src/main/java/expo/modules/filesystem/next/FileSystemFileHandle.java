package expo.modules.filesystem.next;

import bo0.n;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.kotlin.sharedobjects.SharedRef;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b¨\u0006!"}, d2 = {"Lexpo/modules/filesystem/next/FileSystemFileHandle;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Ljava/nio/channels/FileChannel;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lexpo/modules/filesystem/next/FileSystemFile;", Action.FILE_ATTRIBUTE, "<init>", "(Lexpo/modules/filesystem/next/FileSystemFile;)V", "Ljn0/h0;", "ensureIsOpen", "()V", "sharedObjectDidRelease", "close", "", "length", "", "read", "(I)[B", "data", "write", "([B)V", "fileChannel", "Ljava/nio/channels/FileChannel;", "", "value", "getOffset", "()Ljava/lang/Long;", "setOffset", "(Ljava/lang/Long;)V", "offset", "getSize", "size", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileSystemFileHandle extends SharedRef<FileChannel> implements AutoCloseable {
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemFileHandle(FileSystemFile file) {
        super(new RandomAccessFile(file.getFile(), "rw").getChannel(), null, 2, null);
        s.k(file, "file");
        this.fileChannel = getRef();
    }

    private final void ensureIsOpen() throws UnableToReadHandleException {
        if (!this.fileChannel.isOpen()) {
            throw new UnableToReadHandleException("file handle is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        this.fileChannel.close();
    }

    public final Long getOffset() {
        try {
            return Long.valueOf(this.fileChannel.position());
        } catch (Exception unused) {
            return null;
        }
    }

    public final Long getSize() {
        try {
            return Long.valueOf(this.fileChannel.size());
        } catch (Exception unused) {
            return null;
        }
    }

    public final byte[] read(int length) throws UnableToReadHandleException {
        ensureIsOpen();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(n.j(length, (int) (this.fileChannel.size() - this.fileChannel.position())));
            this.fileChannel.read(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            s.j(bArrArray, "array(...)");
            return bArrArray;
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new UnableToReadHandleException(message);
        }
    }

    public final void setOffset(Long l11) throws IOException {
        if (l11 == null) {
            return;
        }
        this.fileChannel.position(l11.longValue());
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void sharedObjectDidRelease() throws IOException {
        close();
    }

    public final void write(byte[] data) throws UnableToWriteHandleException, UnableToReadHandleException {
        s.k(data, "data");
        ensureIsOpen();
        try {
            this.fileChannel.write(ByteBuffer.wrap(data));
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new UnableToWriteHandleException(message);
        }
    }
}
