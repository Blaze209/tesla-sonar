package so;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lso/n;", "", "<init>", "(Ljava/lang/String;I)V", "", "toSpacingType", "()I", "Companion", "f", "ALL", "LEFT", "RIGHT", "TOP", "BOTTOM", "START", "END", "HORIZONTAL", "VERTICAL", "BLOCK_START", "BLOCK_END", "BLOCK", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum n {
    ALL { // from class: so.n.a
        @Override // so.n
        public int toSpacingType() {
            return 8;
        }
    },
    LEFT { // from class: so.n.i
        @Override // so.n
        public int toSpacingType() {
            return 0;
        }
    },
    RIGHT { // from class: so.n.j
        @Override // so.n
        public int toSpacingType() {
            return 2;
        }
    },
    TOP { // from class: so.n.l
        @Override // so.n
        public int toSpacingType() {
            return 1;
        }
    },
    BOTTOM { // from class: so.n.e
        @Override // so.n
        public int toSpacingType() {
            return 3;
        }
    },
    START { // from class: so.n.k
        @Override // so.n
        public int toSpacingType() {
            return 4;
        }
    },
    END { // from class: so.n.g
        @Override // so.n
        public int toSpacingType() {
            return 5;
        }
    },
    HORIZONTAL { // from class: so.n.h
        @Override // so.n
        public int toSpacingType() {
            return 6;
        }
    },
    VERTICAL { // from class: so.n.m
        @Override // so.n
        public int toSpacingType() {
            return 7;
        }
    },
    BLOCK_START { // from class: so.n.d
        @Override // so.n
        public int toSpacingType() {
            return 11;
        }
    },
    BLOCK_END { // from class: so.n.c
        @Override // so.n
        public int toSpacingType() {
            return 10;
        }
    },
    BLOCK { // from class: so.n.b
        @Override // so.n
        public int toSpacingType() {
            return 9;
        }
    };

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: so.n$f, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lso/n$f;", "", "<init>", "()V", "", "spacingType", "Lso/n;", "a", "(I)Lso/n;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(int spacingType) {
            switch (spacingType) {
                case 0:
                    return n.LEFT;
                case 1:
                    return n.TOP;
                case 2:
                    return n.RIGHT;
                case 3:
                    return n.BOTTOM;
                case 4:
                    return n.START;
                case 5:
                    return n.END;
                case 6:
                    return n.HORIZONTAL;
                case 7:
                    return n.VERTICAL;
                case 8:
                    return n.ALL;
                case 9:
                    return n.BLOCK;
                case 10:
                    return n.BLOCK_END;
                case 11:
                    return n.BLOCK_START;
                default:
                    throw new IllegalArgumentException("Unknown spacing type: " + spacingType);
            }
        }

        private Companion() {
        }
    }

    /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final n fromSpacingType(int i11) {
        return INSTANCE.a(i11);
    }

    public static EnumEntries<n> getEntries() {
        return $ENTRIES;
    }

    public abstract int toSpacingType();
}
