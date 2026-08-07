package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractMessageLite implements MessageLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f88241a = 0;

    UninitializedMessageException a() {
        return new UninitializedMessageException(this);
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream, CodedOutputStream.a(CodedOutputStream.computeRawVarint32Size(serializedSize) + serializedSize));
        codedOutputStreamNewInstance.writeRawVarint32(serializedSize);
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {
        protected static UninitializedMessageException a(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo499clone();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        static final class a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f88242a;

            a(InputStream inputStream, int i11) {
                super(inputStream);
                this.f88242a = i11;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f88242a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f88242a <= 0) {
                    return -1;
                }
                int i11 = super.read();
                if (i11 >= 0) {
                    this.f88242a--;
                }
                return i11;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j11) throws IOException {
                long jSkip = super.skip(Math.min(j11, this.f88242a));
                if (jSkip >= 0) {
                    this.f88242a = (int) (((long) this.f88242a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i11, int i12) throws IOException {
                int i13 = this.f88242a;
                if (i13 <= 0) {
                    return -1;
                }
                int i14 = super.read(bArr, i11, Math.min(i12, i13));
                if (i14 >= 0) {
                    this.f88242a -= i14;
                }
                return i14;
            }
        }
    }
}
