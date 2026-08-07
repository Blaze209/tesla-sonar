package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.TextStyle;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p014n4.q;
import p020r2.g2;
import p020r2.w;
import t4.LineHeightStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Li4/r0;", "Ln4/q;", "default", DateTokenConverter.CONVERTER_KEY, "(Li4/r0;Ln4/q;)Li4/r0;", "Lt4/h;", "a", "Lt4/h;", "getDefaultLineHeightStyle", "()Lt4/h;", "DefaultLineHeightStyle", "b", "Li4/r0;", "()Li4/r0;", "DefaultTextStyle", "Lr2/g2;", "Li2/w2;", "c", "Lr2/g2;", "()Lr2/g2;", "LocalTypography", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LineHeightStyle f75444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TextStyle f75445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g2<Typography> f75446c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li2/w2;", "b", "()Li2/w2;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Typography> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f75447c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    }

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.c.INSTANCE.b(), null);
        f75444a = lineHeightStyle;
        f75445b = TextStyle.c(TextStyle.INSTANCE.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, f0.a(), lineHeightStyle, 0, 0, null, 15204351, null);
        f75446c = w.f(a.f75447c);
    }

    public static final TextStyle b() {
        return f75445b;
    }

    public static final g2<Typography> c() {
        return f75446c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle d(TextStyle textStyle, q qVar) {
        return textStyle.l() != null ? textStyle : TextStyle.c(textStyle, 0L, 0L, null, null, null, qVar, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
    }
}
