package gm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lgm/e;", "", "<init>", "()V", "Ljn0/h0;", "h", "", "binaryXmlEnabled", "g", "(Z)Lgm/e;", "Ljava/io/InputStream;", "is", "Lgm/c;", "c", "(Ljava/io/InputStream;)Lgm/c;", "", "a", "I", "maxHeaderLength", "", "Lgm/c$b;", "b", "Ljava/util/List;", "customImageFormatCheckers", "Lgm/a;", "Lgm/a;", "defaultFormatChecker", DateTokenConverter.CONVERTER_KEY, "Z", "e", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy<e> f69219f = m.a(p.SYNCHRONIZED, new wn0.a() { // from class: gm.d
        @Override // wn0.a
        public final Object invoke() {
            return e.f();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxHeaderLength;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends c.b> customImageFormatCheckers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a defaultFormatChecker = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean binaryXmlEnabled;

    /* JADX INFO: renamed from: gm.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgm/e$a;", "", "<init>", "()V", "", "maxHeaderLength", "Ljava/io/InputStream;", "is", "", "imageHeaderBytes", "e", "(ILjava/io/InputStream;[B)I", "Lgm/c;", "b", "(Ljava/io/InputStream;)Lgm/c;", "c", "Lgm/e;", "instance$delegate", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Lgm/e;", "instance", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(int maxHeaderLength, InputStream is2, byte[] imageHeaderBytes) throws IOException {
            if (imageHeaderBytes.length < maxHeaderLength) {
                throw new IllegalStateException("Check failed.");
            }
            if (!is2.markSupported()) {
                return pk.a.b(is2, imageHeaderBytes, 0, maxHeaderLength);
            }
            try {
                is2.mark(maxHeaderLength);
                return pk.a.b(is2, imageHeaderBytes, 0, maxHeaderLength);
            } finally {
                is2.reset();
            }
        }

        public final c b(InputStream is2) {
            s.k(is2, "is");
            return d().c(is2);
        }

        public final c c(InputStream is2) {
            s.k(is2, "is");
            try {
                return b(is2);
            } catch (IOException e11) {
                throw pk.p.a(e11);
            }
        }

        public final e d() {
            return (e) e.f69219f.getValue();
        }

        private Companion() {
        }
    }

    private e() {
        h();
    }

    public static final c d(InputStream inputStream) {
        return INSTANCE.c(inputStream);
    }

    public static final e e() {
        return INSTANCE.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e f() {
        return new e();
    }

    private final void h() {
        this.maxHeaderLength = this.defaultFormatChecker.getHeaderSize();
        List<? extends c.b> list = this.customImageFormatCheckers;
        if (list != null) {
            s.h(list);
            Iterator<? extends c.b> it = list.iterator();
            while (it.hasNext()) {
                this.maxHeaderLength = Math.max(this.maxHeaderLength, it.next().getHeaderSize());
            }
        }
    }

    public final c c(InputStream is2) throws IOException {
        s.k(is2, "is");
        int i11 = this.maxHeaderLength;
        byte[] bArr = new byte[i11];
        int iE = INSTANCE.e(i11, is2, bArr);
        c cVarA = this.defaultFormatChecker.a(bArr, iE);
        if (s.f(cVarA, b.BINARY_XML) && !this.binaryXmlEnabled) {
            cVarA = c.f69215d;
        }
        if (cVarA != c.f69215d) {
            return cVarA;
        }
        List<? extends c.b> list = this.customImageFormatCheckers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c cVarA2 = ((c.b) it.next()).a(bArr, iE);
                if (cVarA2 != c.f69215d) {
                    return cVarA2;
                }
            }
        }
        return c.f69215d;
    }

    public final e g(boolean binaryXmlEnabled) {
        this.binaryXmlEnabled = binaryXmlEnabled;
        return this;
    }
}
