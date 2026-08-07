package com.facebook.react.views.scroll;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/views/scroll/l;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "BEGIN_DRAG", "END_DRAG", "SCROLL", "MOMENTUM_BEGIN", "MOMENTUM_END", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum l {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/scroll/l$a;", "", "<init>", "()V", "Lcom/facebook/react/views/scroll/l;", "type", "", "a", "(Lcom/facebook/react/views/scroll/l;)Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.react.views.scroll.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C0461a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23643a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.BEGIN_DRAG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.END_DRAG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[l.SCROLL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[l.MOMENTUM_BEGIN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[l.MOMENTUM_END.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f23643a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(l type) {
            s.k(type, "type");
            int i11 = C0461a.f23643a[type.ordinal()];
            if (i11 == 1) {
                return "topScrollBeginDrag";
            }
            if (i11 == 2) {
                return "topScrollEndDrag";
            }
            if (i11 == 3) {
                return "topScroll";
            }
            if (i11 == 4) {
                return "topMomentumScrollBegin";
            }
            if (i11 == 5) {
                return "topMomentumScrollEnd";
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }

    public static EnumEntries<l> getEntries() {
        return $ENTRIES;
    }

    public static final String getJSEventName(l lVar) {
        return INSTANCE.a(lVar);
    }
}
