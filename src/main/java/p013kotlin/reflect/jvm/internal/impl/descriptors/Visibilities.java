package p013kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class Visibilities {
    public static final Visibilities INSTANCE = new Visibilities();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Visibility, Integer> f86719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Public f86720b;

    public static final class Inherited extends Visibility {
        public static final Inherited INSTANCE = new Inherited();

        private Inherited() {
            super("inherited", false);
        }
    }

    public static final class Internal extends Visibility {
        public static final Internal INSTANCE = new Internal();

        private Internal() {
            super("internal", false);
        }
    }

    public static final class InvisibleFake extends Visibility {
        public static final InvisibleFake INSTANCE = new InvisibleFake();

        private InvisibleFake() {
            super("invisible_fake", false);
        }
    }

    public static final class Local extends Visibility {
        public static final Local INSTANCE = new Local();

        private Local() {
            super(ImagesContract.LOCAL, false);
        }
    }

    public static final class Private extends Visibility {
        public static final Private INSTANCE = new Private();

        private Private() {
            super("private", false);
        }
    }

    public static final class PrivateToThis extends Visibility {
        public static final PrivateToThis INSTANCE = new PrivateToThis();

        private PrivateToThis() {
            super("private_to_this", false);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    public static final class Protected extends Visibility {
        public static final Protected INSTANCE = new Protected();

        private Protected() {
            super("protected", true);
        }
    }

    public static final class Public extends Visibility {
        public static final Public INSTANCE = new Public();

        private Public() {
            super("public", true);
        }
    }

    public static final class Unknown extends Visibility {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("unknown", false);
        }
    }

    static {
        Map mapC = v0.c();
        mapC.put(PrivateToThis.INSTANCE, 0);
        mapC.put(Private.INSTANCE, 0);
        mapC.put(Internal.INSTANCE, 1);
        mapC.put(Protected.INSTANCE, 1);
        Public r11 = Public.INSTANCE;
        mapC.put(r11, 2);
        f86719a = v0.b(mapC);
        f86720b = r11;
    }

    private Visibilities() {
    }

    public final Integer compareLocal$compiler_common(Visibility first, Visibility second) {
        s.k(first, "first");
        s.k(second, "second");
        if (first == second) {
            return 0;
        }
        Map<Visibility, Integer> map = f86719a;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || s.f(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean isPrivate(Visibility visibility) {
        s.k(visibility, "visibility");
        return visibility == Private.INSTANCE || visibility == PrivateToThis.INSTANCE;
    }
}
