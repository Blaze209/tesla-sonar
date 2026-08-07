package n2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\"&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\u0010"}, d2 = {"Lr2/g2;", "Ln2/m;", "a", "Lr2/g2;", DateTokenConverter.CONVERTER_KEY, "()Lr2/g2;", "getLocalRippleTheme$annotations", "()V", "LocalRippleTheme", "Ln2/d;", "b", "Ln2/d;", "LightThemeHighContrastRippleAlpha", "c", "LightThemeLowContrastRippleAlpha", "DarkThemeRippleAlpha", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<m> f92717a = w.f(a.f92721c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final RippleAlpha f92718b = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final RippleAlpha f92719c = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final RippleAlpha f92720d = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln2/m;", "b", "()Ln2/m;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<m> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f92721c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            return n2.a.f92653b;
        }
    }

    public static final g2<m> d() {
        return f92717a;
    }
}
