package re;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00020\u0006\"\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lre/d;", "", "<init>", "()V", "", "value", "", "", "additionalCharsToReplace", "a", "(Ljava/lang/String;[C)Ljava/lang/String;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f107856a = new d();

    private d() {
    }

    public static final String a(String value, char... additionalCharsToReplace) {
        s.k(value, "value");
        s.k(additionalCharsToReplace, "additionalCharsToReplace");
        return new q("[\\s" + new String(additionalCharsToReplace) + "]").j(value, "");
    }
}
