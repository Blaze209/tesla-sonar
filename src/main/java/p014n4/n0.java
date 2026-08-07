package p014n4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Ln4/n0;", "", "Ln4/q;", "fontFamily", "b", "(Ln4/q;)Ln4/q;", "Ln4/f0;", "fontWeight", "a", "(Ln4/f0;)Ln4/f0;", "Ln4/b0;", "fontStyle", "c", "(I)I", "Ln4/c0;", "fontSynthesis", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f93000a;

    /* JADX INFO: renamed from: n4.n0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ln4/n0$a;", "", "<init>", "()V", "Ln4/n0;", "b", "Ln4/n0;", "a", "()Ln4/n0;", "Default", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f93000a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final n0 Default = new C1984a();

        /* JADX INFO: renamed from: n4.n0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"n4/n0$a$a", "Ln4/n0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C1984a implements n0 {
            C1984a() {
            }
        }

        private Companion() {
        }

        public final n0 a() {
            return Default;
        }
    }

    default FontWeight a(FontWeight fontWeight) {
        return fontWeight;
    }

    default q b(q fontFamily) {
        return fontFamily;
    }

    default int c(int fontStyle) {
        return fontStyle;
    }

    default int d(int fontSynthesis) {
        return fontSynthesis;
    }
}
