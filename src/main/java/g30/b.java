package g30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00072\u00020\u0001:\u0006\u0007\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lg30/b;", "Lw30/a;", "<init>", "()V", "", "", "", "a", "()Ljava/util/Map;", "additionalParams", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lg30/b$a;", "Lg30/b$c;", "Lg30/b$d;", "Lg30/b$e;", "Lg30/b$f;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b implements w30.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lg30/b$a;", "Lg30/b;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public a() {
            super(null);
            this.eventName = "bi_card_number_completed";
            this.additionalParams = v0.i();
        }

        @Override // g30.b
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    /* JADX INFO: renamed from: g30.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lg30/b$b;", "", "<init>", "()V", "Lio0/b;", "", "b", "(J)F", "asSeconds", "", "FIELD_DURATION", "Ljava/lang/String;", "FIELD_ERROR_MESSAGE", "FIELD_SELECTED_LPM", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(long j11) {
            return (float) io0.b.H(j11, io0.e.SECONDS);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lg30/b$c;", "Lg30/b;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public c() {
            super(null);
            this.eventName = "bi_load_started";
            this.additionalParams = v0.i();
        }

        @Override // g30.b
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lg30/b$d;", "Lg30/b;", "", "code", "<init>", "(Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String code) {
            super(null);
            s.k(code, "code");
            this.eventName = "bi_form_interacted";
            this.additionalParams = v0.f(x.a("selected_lpm", code));
        }

        @Override // g30.b
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lg30/b$e;", "Lg30/b;", "", "code", "<init>", "(Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String code) {
            super(null);
            s.k(code, "code");
            this.eventName = "bi_form_shown";
            this.additionalParams = v0.f(x.a("selected_lpm", code));
        }

        @Override // g30.b
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lg30/b$f;", "Lg30/b;", "", "code", "Lio0/b;", "duration", "<init>", "(Ljava/lang/String;Lio0/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public /* synthetic */ f(String str, io0.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bVar);
        }

        @Override // g30.b
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private f(String code, io0.b bVar) {
            super(0 == true ? 1 : 0);
            s.k(code, "code");
            this.eventName = "bi_done_button_tapped";
            this.additionalParams = v0.m(x.a("selected_lpm", code), x.a("duration", bVar != null ? Float.valueOf(b.INSTANCE.b(bVar.getRawValue())) : null));
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, Object> a();

    private b() {
    }
}
