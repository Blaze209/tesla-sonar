package b40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00072\u00020\u0001:\u0012\u0007\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0011\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lb40/a;", "Lw30/a;", "<init>", "()V", "", "", "", "a", "()Ljava/util/Map;", "additionalParams", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "n", "o", "p", "q", "r", "Lb40/a$a;", "Lb40/a$b;", "Lb40/a$c;", "Lb40/a$e;", "Lb40/a$f;", "Lb40/a$g;", "Lb40/a$h;", "Lb40/a$i;", "Lb40/a$j;", "Lb40/a$k;", "Lb40/a$l;", "Lb40/a$m;", "Lb40/a$n;", "Lb40/a$o;", "Lb40/a$p;", "Lb40/a$q;", "Lb40/a$r;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a implements w30.a {

    /* JADX INFO: renamed from: b40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lb40/a$a;", "Lb40/a;", "Lb40/b$a;", "style", "<init>", "(Lb40/b$a;)V", "", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C0314a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: b40.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C0315a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16370a;

            static {
                int[] iArr = new int[b40.b.a.values().length];
                try {
                    iArr[b40.b.a.SetupIntent.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b40.b.a.CreateAttach.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f16370a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0314a(b40.b.a style) {
            String str;
            super(null);
            s.k(style, "style");
            this.additionalParams = v0.i();
            int i11 = C0315a.f16370a[style.ordinal()];
            if (i11 == 1) {
                str = "cs_add_payment_method_via_setup_intent_failure";
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "cs_add_payment_method_via_createAttach_failure";
            }
            this.eventName = str;
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lb40/a$b;", "Lb40/a;", "Lb40/b$a;", "style", "<init>", "(Lb40/b$a;)V", "", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: b40.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C0316a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16373a;

            static {
                int[] iArr = new int[b40.b.a.values().length];
                try {
                    iArr[b40.b.a.SetupIntent.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b40.b.a.CreateAttach.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f16373a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b40.b.a style) {
            String str;
            super(null);
            s.k(style, "style");
            this.additionalParams = v0.i();
            int i11 = C0316a.f16373a[style.ordinal()];
            if (i11 == 1) {
                str = "cs_add_payment_method_via_setup_intent_success";
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "cs_add_payment_method_via_createAttach_success";
            }
            this.eventName = str;
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lb40/a$c;", "Lb40/a;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public c() {
            super(null);
            this.eventName = "cs_card_number_completed";
            this.additionalParams = v0.i();
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lb40/a$e;", "Lb40/a;", "", "type", "<init>", "(Ljava/lang/String;)V", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String type) {
            super(null);
            s.k(type, "type");
            this.additionalParams = v0.f(x.a("payment_method_type", type));
            this.eventName = "cs_select_payment_method_screen_confirmed_savedpm_failure";
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lb40/a$f;", "Lb40/a;", "", "type", "<init>", "(Ljava/lang/String;)V", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String type) {
            super(null);
            s.k(type, "type");
            this.additionalParams = v0.f(x.a("payment_method_type", type));
            this.eventName = "cs_select_payment_method_screen_confirmed_savedpm_success";
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lb40/a$g;", "Lb40/a;", "<init>", "()V", "", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        public g() {
            super(null);
            this.additionalParams = v0.i();
            this.eventName = "cs_select_payment_method_screen_done_tapped";
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lb40/a$h;", "Lb40/a;", "<init>", "()V", "", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        public h() {
            super(null);
            this.additionalParams = v0.i();
            this.eventName = "cs_select_payment_method_screen_edit_tapped";
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lb40/a$i;", "Lb40/a;", "Lb40/a$i$a;", "source", "Lcom/stripe/android/model/h;", "selectedBrand", "<init>", "(Lb40/a$i$a;Lcom/stripe/android/model/h;)V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: b40.a$i$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lb40/a$i$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Edit", "Add", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum EnumC0317a {
            Edit("edit"),
            Add("add");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String value;

            EnumC0317a(String str) {
                this.value = str;
            }

            public static EnumEntries<EnumC0317a> getEntries() {
                return $ENTRIES;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(EnumC0317a source, com.stripe.android.model.h hVar) {
            super(0 == true ? 1 : 0);
            s.k(source, "source");
            this.eventName = "cs_close_cbc_dropdown";
            this.additionalParams = v0.m(x.a("cbc_event_source", source.getValue()), x.a("selected_card_brand", hVar != null ? hVar.getCode() : null));
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lb40/a$j;", "Lb40/a;", "Lcom/stripe/android/customersheet/d$c;", "configuration", "Lcom/stripe/android/customersheet/g$c;", "integrationType", "<init>", "(Lcom/stripe/android/customersheet/d$c;Lcom/stripe/android/customersheet/g$c;)V", "b", "Lcom/stripe/android/customersheet/d$c;", "", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.customersheet.d.Configuration configuration;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: b40.a$j$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C0318a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16388a;

            static {
                int[] iArr = new int[com.stripe.android.customersheet.g.c.values().length];
                try {
                    iArr[com.stripe.android.customersheet.g.c.CustomerSession.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.stripe.android.customersheet.g.c.CustomerAdapter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f16388a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.stripe.android.customersheet.d.Configuration configuration, com.stripe.android.customersheet.g.c integrationType) {
            String str;
            super(null);
            s.k(configuration, "configuration");
            s.k(integrationType, "integrationType");
            this.configuration = configuration;
            int i11 = C0318a.f16388a[integrationType.ordinal()];
            if (i11 == 1) {
                str = "cs_init_with_customer_session";
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "cs_init_with_customer_adapter";
            }
            this.eventName = str;
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return v0.f(x.a("cs_config", v0.m(x.a("google_pay_enabled", Boolean.valueOf(this.configuration.getGooglePayEnabled())), x.a("default_billing_details", Boolean.valueOf(this.configuration.getDefaultBillingDetails().d())), x.a("appearance", i30.a.b(this.configuration.getAppearance())), x.a("allows_removal_of_last_saved_payment_method", Boolean.valueOf(this.configuration.getAllowsRemovalOfLastSavedPaymentMethod())), x.a("payment_method_order", this.configuration.i()), x.a("billing_details_collection_configuration", i30.a.c(this.configuration.getBillingDetailsCollectionConfiguration())), x.a("preferred_networks", i30.a.e(this.configuration.j())), x.a("card_brand_acceptance", Boolean.valueOf(i30.a.f(this.configuration.getCardBrandAcceptance()))))));
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lb40/a$k;", "Lb40/a;", "<init>", "()V", "", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        public k() {
            super(null);
            this.additionalParams = v0.i();
            this.eventName = "cs_select_payment_method_screen_removepm_failure";
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lb40/a$l;", "Lb40/a;", "<init>", "()V", "", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        public l() {
            super(null);
            this.additionalParams = v0.i();
            this.eventName = "cs_select_payment_method_screen_removepm_success";
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lb40/a$m;", "Lb40/a;", "Lb40/b$c;", AnalyticsContext.Screen, "<init>", "(Lb40/b$c;)V", "", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: b40.a$m$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C0319a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16395a;

            static {
                int[] iArr = new int[b40.b.c.values().length];
                try {
                    iArr[b40.b.c.EditPaymentMethod.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f16395a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(b40.b.c screen) {
            super(null);
            s.k(screen, "screen");
            this.additionalParams = v0.i();
            if (C0319a.f16395a[screen.ordinal()] == 1) {
                this.eventName = "cs_cancel_edit_screen";
                return;
            }
            throw new IllegalArgumentException(screen.name() + " has no supported event for hiding screen!");
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lb40/a$n;", "Lb40/a;", "Lb40/b$c;", AnalyticsContext.Screen, "<init>", "(Lb40/b$c;)V", "", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "c", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: b40.a$n$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C0320a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16398a;

            static {
                int[] iArr = new int[b40.b.c.values().length];
                try {
                    iArr[b40.b.c.AddPaymentMethod.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b40.b.c.SelectPaymentMethod.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b40.b.c.EditPaymentMethod.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f16398a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(b40.b.c screen) {
            String str;
            super(null);
            s.k(screen, "screen");
            this.additionalParams = v0.i();
            int i11 = C0320a.f16398a[screen.ordinal()];
            if (i11 == 1) {
                str = "cs_add_payment_method_screen_presented";
            } else if (i11 == 2) {
                str = "cs_select_payment_method_screen_presented";
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "cs_open_edit_screen";
            }
            this.eventName = str;
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lb40/a$o;", "Lb40/a;", "", "code", "<init>", "(Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String code) {
            super(null);
            s.k(code, "code");
            this.eventName = "cs_carousel_payment_method_selected";
            this.additionalParams = v0.f(x.a("selected_lpm", code));
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lb40/a$p;", "Lb40/a;", "Lb40/a$p$a;", "source", "Lcom/stripe/android/model/h;", "selectedBrand", "<init>", "(Lb40/a$p$a;Lcom/stripe/android/model/h;)V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX INFO: renamed from: b40.a$p$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lb40/a$p$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Edit", "Add", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum EnumC0321a {
            Edit("edit"),
            Add("add");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String value;

            EnumC0321a(String str) {
                this.value = str;
            }

            public static EnumEntries<EnumC0321a> getEntries() {
                return $ENTRIES;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(EnumC0321a source, com.stripe.android.model.h selectedBrand) {
            super(null);
            s.k(source, "source");
            s.k(selectedBrand, "selectedBrand");
            this.eventName = "cs_open_cbc_dropdown";
            this.additionalParams = v0.m(x.a("cbc_event_source", source.getValue()), x.a("selected_card_brand", selectedBrand.getCode()));
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lb40/a$q;", "Lb40/a;", "Lcom/stripe/android/model/h;", "selectedBrand", "", AnalyticsAttribute.Error, "<init>", "(Lcom/stripe/android/model/h;Ljava/lang/Throwable;)V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(com.stripe.android.model.h selectedBrand, Throwable error) {
            super(null);
            s.k(selectedBrand, "selectedBrand");
            s.k(error, "error");
            this.eventName = "cs_update_card_failed";
            this.additionalParams = v0.m(x.a("selected_card_brand", selectedBrand.getCode()), x.a("error_message", error.getMessage()));
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lb40/a$r;", "Lb40/a;", "Lcom/stripe/android/model/h;", "selectedBrand", "<init>", "(Lcom/stripe/android/model/h;)V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "c", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class r extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(com.stripe.android.model.h selectedBrand) {
            super(null);
            s.k(selectedBrand, "selectedBrand");
            this.eventName = "cs_update_card";
            this.additionalParams = v0.f(x.a("selected_card_brand", selectedBrand.getCode()));
        }

        @Override // b40.a
        public Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, Object> a();

    private a() {
    }
}
