package vw;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements sv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sv.a f119885a = new c();

    private static final class a implements rv.c<AndroidApplicationInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f119886a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f119887b = rv.b.d("packageName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f119888c = rv.b.d("versionName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f119889d = rv.b.d("appBuildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f119890e = rv.b.d("deviceManufacturer");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f119891f = rv.b.d("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f119892g = rv.b.d("appProcessDetails");

        private a() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AndroidApplicationInfo androidApplicationInfo, rv.d dVar) {
            dVar.add(f119887b, androidApplicationInfo.getPackageName());
            dVar.add(f119888c, androidApplicationInfo.getVersionName());
            dVar.add(f119889d, androidApplicationInfo.getAppBuildVersion());
            dVar.add(f119890e, androidApplicationInfo.getDeviceManufacturer());
            dVar.add(f119891f, androidApplicationInfo.getCurrentProcessDetails());
            dVar.add(f119892g, androidApplicationInfo.b());
        }
    }

    private static final class b implements rv.c<ApplicationInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f119893a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f119894b = rv.b.d("appId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f119895c = rv.b.d("deviceModel");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f119896d = rv.b.d("sessionSdkVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f119897e = rv.b.d("osVersion");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f119898f = rv.b.d("logEnvironment");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f119899g = rv.b.d("androidAppInfo");

        private b() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(ApplicationInfo applicationInfo, rv.d dVar) {
            dVar.add(f119894b, applicationInfo.getAppId());
            dVar.add(f119895c, applicationInfo.getDeviceModel());
            dVar.add(f119896d, applicationInfo.getSessionSdkVersion());
            dVar.add(f119897e, applicationInfo.getOsVersion());
            dVar.add(f119898f, applicationInfo.getLogEnvironment());
            dVar.add(f119899g, applicationInfo.getAndroidAppInfo());
        }
    }

    /* JADX INFO: renamed from: vw.c$c, reason: collision with other inner class name */
    private static final class C2566c implements rv.c<DataCollectionStatus> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C2566c f119900a = new C2566c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f119901b = rv.b.d("performance");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f119902c = rv.b.d("crashlytics");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f119903d = rv.b.d("sessionSamplingRate");

        private C2566c() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(DataCollectionStatus dataCollectionStatus, rv.d dVar) {
            dVar.add(f119901b, dataCollectionStatus.getPerformance());
            dVar.add(f119902c, dataCollectionStatus.getCrashlytics());
            dVar.add(f119903d, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    private static final class d implements rv.c<ProcessDetails> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f119904a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f119905b = rv.b.d("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f119906c = rv.b.d("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f119907d = rv.b.d("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f119908e = rv.b.d("defaultProcess");

        private d() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(ProcessDetails processDetails, rv.d dVar) {
            dVar.add(f119905b, processDetails.getProcessName());
            dVar.add(f119906c, processDetails.getPid());
            dVar.add(f119907d, processDetails.getImportance());
            dVar.add(f119908e, processDetails.getIsDefaultProcess());
        }
    }

    private static final class e implements rv.c<SessionEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f119909a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f119910b = rv.b.d("eventType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f119911c = rv.b.d("sessionData");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f119912d = rv.b.d("applicationInfo");

        private e() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(SessionEvent sessionEvent, rv.d dVar) {
            dVar.add(f119910b, sessionEvent.getEventType());
            dVar.add(f119911c, sessionEvent.getSessionData());
            dVar.add(f119912d, sessionEvent.getApplicationInfo());
        }
    }

    private static final class f implements rv.c<SessionInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f119913a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f119914b = rv.b.d("sessionId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f119915c = rv.b.d("firstSessionId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f119916d = rv.b.d("sessionIndex");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f119917e = rv.b.d("eventTimestampUs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f119918f = rv.b.d("dataCollectionStatus");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f119919g = rv.b.d("firebaseInstallationId");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f119920h = rv.b.d("firebaseAuthenticationToken");

        private f() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(SessionInfo sessionInfo, rv.d dVar) {
            dVar.add(f119914b, sessionInfo.getSessionId());
            dVar.add(f119915c, sessionInfo.getFirstSessionId());
            dVar.add(f119916d, sessionInfo.getSessionIndex());
            dVar.add(f119917e, sessionInfo.getEventTimestampUs());
            dVar.add(f119918f, sessionInfo.getDataCollectionStatus());
            dVar.add(f119919g, sessionInfo.getFirebaseInstallationId());
            dVar.add(f119920h, sessionInfo.getFirebaseAuthenticationToken());
        }
    }

    private c() {
    }

    @Override // sv.a
    public void configure(sv.b<?> bVar) {
        bVar.registerEncoder(SessionEvent.class, e.f119909a);
        bVar.registerEncoder(SessionInfo.class, f.f119913a);
        bVar.registerEncoder(DataCollectionStatus.class, C2566c.f119900a);
        bVar.registerEncoder(ApplicationInfo.class, b.f119893a);
        bVar.registerEncoder(AndroidApplicationInfo.class, a.f119886a);
        bVar.registerEncoder(ProcessDetails.class, d.f119904a);
    }
}
