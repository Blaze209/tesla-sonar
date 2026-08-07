package e60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Le60/d;", "Lw30/a;", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "Le60/d$a;", "Le60/d$b;", "Le60/d$c;", "Le60/d$d;", "Le60/d$e;", "Le60/d$f;", "Le60/d$g;", "Le60/d$h;", "Le60/d$i;", "Le60/d$j;", "Le60/d$k;", "Le60/d$l;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class d implements w30.a {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$a;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f62119a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.account_lookup.failure";

        private a() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$b;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f62121a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.popup.cancel";

        private b() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$c;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f62123a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.popup.error";

        private c() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    /* JADX INFO: renamed from: e60.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$d;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C1276d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1276d f62125a = new C1276d();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.popup.logout";

        private C1276d() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$e;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f62127a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.popup.show";

        private e() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$f;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f62129a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.popup.skipped";

        private f() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$g;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f62131a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.popup.success";

        private g() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$h;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f62133a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.signup.checkbox_checked";

        private h() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$i;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f62135a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.signup.complete";

        private i() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$j;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f62137a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.signup.failure";

        private j() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$k;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f62139a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.signup.failure.invalidSessionState";

        private k() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le60/d$l;", "Le60/d;", "<init>", "()V", "", "b", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f62141a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String eventName = "link.signup.start";

        private l() {
            super(null);
        }

        @Override // w30.a
        public String getEventName() {
            return eventName;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
