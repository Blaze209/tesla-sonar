package p013kotlin.reflect.jvm.internal.impl.renderer;

import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public enum RenderingFormat {
    PLAIN { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.b
        @Override // p013kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public String escape(String string) {
            s.k(string, "string");
            return string;
        }
    },
    HTML { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.a
        @Override // p013kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public String escape(String string) {
            s.k(string, "string");
            return t.V(t.V(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* synthetic */ RenderingFormat(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String escape(String str);
}
