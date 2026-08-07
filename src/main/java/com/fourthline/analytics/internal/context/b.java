package com.fourthline.analytics.internal.context;

import com.fourthline.analytics.internal.AnalyticsContext;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AnalyticsContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24033b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24034a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f24035b = "platform";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f24036c = "sdk_version";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f24037d = "origin";

        private a() {
        }

        public final String a() {
            return f24037d;
        }

        public final String b() {
            return f24035b;
        }

        public final String c() {
            return f24036c;
        }
    }

    public b() {
        super("session");
        this.f24032a = "session";
        this.f24033b = "iglu:com.fourthline.sdk/session/jsonschema/1-0-0";
        a aVar = a.f24034a;
        set(aVar.b(), "Android");
        set(aVar.c(), "3.2.22");
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getIdentifier() {
        return this.f24032a;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getSchema() {
        return this.f24033b;
    }
}
