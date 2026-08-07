package bx;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 {
    public static com.google.gson.l a(ex.a aVar) {
        boolean z11;
        try {
            try {
                aVar.n0();
                z11 = false;
                try {
                    return com.google.gson.internal.bind.p.V.b(aVar);
                } catch (EOFException e11) {
                    e = e11;
                    if (z11) {
                        return com.google.gson.m.f45010a;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (EOFException e12) {
                e = e12;
                z11 = true;
            }
        } catch (MalformedJsonException e13) {
            throw new JsonSyntaxException(e13);
        } catch (IOException e14) {
            throw new JsonIOException(e14);
        } catch (NumberFormatException e15) {
            throw new JsonSyntaxException(e15);
        }
    }

    public static void b(com.google.gson.l lVar, ex.c cVar) {
        com.google.gson.internal.bind.p.V.d(cVar, lVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    private static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f18183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f18184b = new a();

        private static class a implements CharSequence {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private char[] f18185a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f18186b;

            private a() {
            }

            void a(char[] cArr) {
                this.f18185a = cArr;
                this.f18186b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i11) {
                return this.f18185a[i11];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f18185a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i11, int i12) {
                return new String(this.f18185a, i11, i12 - i11);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f18186b == null) {
                    this.f18186b = new String(this.f18185a);
                }
                return this.f18186b;
            }
        }

        b(Appendable appendable) {
            this.f18183a = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) throws IOException {
            this.f18184b.a(cArr);
            this.f18183a.append(this.f18184b, i11, i12 + i11);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f18183a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i11) throws IOException {
            this.f18183a.append((char) i11);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i11, int i12) throws IOException {
            this.f18183a.append(charSequence, i11, i12);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i11, int i12) throws IOException {
            Objects.requireNonNull(str);
            this.f18183a.append(str, i11, i12 + i11);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
