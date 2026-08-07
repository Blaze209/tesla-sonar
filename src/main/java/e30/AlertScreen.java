package e30;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: renamed from: e30.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u001bBO\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, d2 = {"Le30/e;", "", "", "Le30/e$a;", "", "buttons", "message", "title", "", "cancelable", "Lkotlin/Function1;", "Le30/e$b;", "Ljn0/h0;", "onEvent", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLwn0/l;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "e", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "Lwn0/l;", "()Lwn0/l;", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AlertScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<a, String> buttons;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cancelable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<b, h0> onEvent;

    /* JADX INFO: renamed from: e30.e$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Le30/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "NEUTRAL", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum a {
        POSITIVE,
        NEGATIVE,
        NEUTRAL
    }

    /* JADX INFO: renamed from: e30.e$b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Le30/e$b;", "", "<init>", "()V", "a", "b", "Le30/e$b$a;", "Le30/e$b$b;", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: e30.e$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Le30/e$b$a;", "Le30/e$b;", "Le30/e$a;", "button", "<init>", "(Le30/e$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le30/e$a;", "getButton", "()Le30/e$a;", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class ButtonClicked extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final a button;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ButtonClicked(a button) {
                super(null);
                s.k(button, "button");
                this.button = button;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ButtonClicked) && this.button == ((ButtonClicked) other).button;
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            public String toString() {
                return "ButtonClicked(button=" + this.button + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* JADX INFO: renamed from: e30.e$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le30/e$b$b;", "Le30/e$b;", "<init>", "()V", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C1264b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1264b f61650a = new C1264b();

            private C1264b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlertScreen(Map<a, String> buttons, String message, String title, boolean z11, l<? super b, h0> onEvent) {
        s.k(buttons, "buttons");
        s.k(message, "message");
        s.k(title, "title");
        s.k(onEvent, "onEvent");
        this.buttons = buttons;
        this.message = message;
        this.title = title;
        this.cancelable = z11;
        this.onEvent = onEvent;
    }

    public final Map<a, String> a() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final l<b, h0> d() {
        return this.onEvent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!s.f(AlertScreen.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.AlertScreen");
        }
        AlertScreen alertScreen = (AlertScreen) other;
        return s.f(this.buttons, alertScreen.buttons) && s.f(this.message, alertScreen.message) && s.f(this.title, alertScreen.title) && this.cancelable == alertScreen.cancelable;
    }

    public int hashCode() {
        return (((((this.buttons.hashCode() * 31) + this.message.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.cancelable);
    }

    public String toString() {
        return "AlertScreen(buttons=" + this.buttons + ", message=" + this.message + ", title=" + this.title + ", cancelable=" + this.cancelable + ", onEvent=" + this.onEvent + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ AlertScreen(Map map, String str, String str2, boolean z11, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? v0.i() : map, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? true : z11, lVar);
    }
}
