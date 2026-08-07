package q2;

import i4.TextStyle;
import p013kotlin.Metadata;
import t4.LineHeightStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0001\u0010\t¨\u0006\u000b"}, d2 = {"Lt4/h;", "a", "Lt4/h;", "getDefaultLineHeightStyle", "()Lt4/h;", "DefaultLineHeightStyle", "Li4/r0;", "b", "Li4/r0;", "()Li4/r0;", "DefaultTextStyle", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LineHeightStyle f104663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TextStyle f104664b;

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.c.INSTANCE.b(), null);
        f104663a = lineHeightStyle;
        f104664b = TextStyle.c(TextStyle.INSTANCE.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, p2.a.a(), lineHeightStyle, 0, 0, null, 15204351, null);
    }

    public static final TextStyle a() {
        return f104664b;
    }
}
