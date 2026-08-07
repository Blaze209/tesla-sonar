package ro;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lro/b;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "OPACITY", "SCALE_X", "SCALE_Y", "SCALE_XY", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum b {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ro.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lro/b$a;", "", "<init>", "()V", "", "name", "Lro/b;", "a", "(Ljava/lang/String;)Lro/b;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final b a(String name) {
            s.k(name, "name");
            switch (name.hashCode()) {
                case -1267206133:
                    if (name.equals("opacity")) {
                        return b.OPACITY;
                    }
                    break;
                case -908189618:
                    if (name.equals("scaleX")) {
                        return b.SCALE_X;
                    }
                    break;
                case -908189617:
                    if (name.equals("scaleY")) {
                        return b.SCALE_Y;
                    }
                    break;
                case 1910893003:
                    if (name.equals("scaleXY")) {
                        return b.SCALE_XY;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported animated property: " + name);
        }

        private Companion() {
        }
    }

    public static final b fromString(String str) {
        return INSTANCE.a(str);
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }
}
