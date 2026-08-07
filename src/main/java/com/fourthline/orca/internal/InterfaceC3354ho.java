package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.NewAnalyticsEvent;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3354ho {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ho$a */
    public interface a extends NewAnalyticsEvent {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ho$a$a, reason: collision with other inner class name */
        public static final class C0566a {
            public static Map a(a aVar) {
                return NewAnalyticsEvent.DefaultImpls.getAttributes(aVar);
            }

            public static String b(a aVar) {
                return "TODO";
            }

            public static String c(a aVar) {
                return NewAnalyticsEvent.DefaultImpls.getSchema(aVar);
            }
        }
    }

    void track(a aVar);
}
