package com.facebook.react.uimanager;

import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/x;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "NONE", "BOX_NONE", "BOX_ONLY", "AUTO", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum x {
    NONE,
    BOX_NONE,
    BOX_ONLY,
    AUTO;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.facebook.react.uimanager.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/x$a;", "", "<init>", "()V", "", "pointerEventsStr", "Lcom/facebook/react/uimanager/x;", "c", "(Ljava/lang/String;)Lcom/facebook/react/uimanager/x;", "pointerEvents", "", "a", "(Lcom/facebook/react/uimanager/x;)Z", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(x pointerEvents) {
            p013kotlin.jvm.internal.s.k(pointerEvents, "pointerEvents");
            return pointerEvents == x.AUTO || pointerEvents == x.BOX_ONLY;
        }

        public final boolean b(x pointerEvents) {
            p013kotlin.jvm.internal.s.k(pointerEvents, "pointerEvents");
            return pointerEvents == x.AUTO || pointerEvents == x.BOX_NONE;
        }

        public final x c(String pointerEventsStr) {
            if (pointerEventsStr == null) {
                return x.AUTO;
            }
            Locale US = Locale.US;
            p013kotlin.jvm.internal.s.j(US, "US");
            String upperCase = pointerEventsStr.toUpperCase(US);
            p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
            return x.valueOf(p013kotlin.text.t.V(upperCase, "-", "_", false, 4, null));
        }

        private Companion() {
        }
    }

    public static final boolean canBeTouchTarget(x xVar) {
        return INSTANCE.a(xVar);
    }

    public static final boolean canChildrenBeTouchTarget(x xVar) {
        return INSTANCE.b(xVar);
    }

    public static EnumEntries<x> getEntries() {
        return $ENTRIES;
    }

    public static final x parsePointerEvents(String str) {
        return INSTANCE.c(str);
    }
}
