package com.fourthline.orca;

import com.fourthline.analytics.internal.AnalyticsContext;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/fourthline/orca/Orca;", "", "<init>", "()V", "a", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Orca {
    public static final int $stable = 0;
    public static final Orca INSTANCE = new Orca();

    public enum a {
        Workflow(AnalyticsContext.Workflow),
        Components("components");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24755e = on0.a.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24756a;

        a(String str) {
            this.f24756a = str;
        }

        public final String b() {
            return this.f24756a;
        }
    }

    private Orca() {
    }
}
