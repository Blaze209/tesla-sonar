package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/orca/internal/H2;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public enum H2 {
    Online,
    Sepa,
    Manual;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26078f = on0.a.a(a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f26073a = jn0.m.a(jn0.p.PUBLICATION, new wn0.a() { // from class: com.fourthline.orca.internal.wc0
        @Override // wn0.a
        public final Object invoke() {
            return H2.b();
        }
    });

    /* JADX INFO: renamed from: com.fourthline.orca.internal.H2$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ ro0.d a() {
            return (ro0.d) H2.f26073a.getValue();
        }

        public final ro0.d<H2> serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ ro0.d b() {
        return vo0.a0.b("com.fourthline.orca.bav.internal.model.BavType", values());
    }
}
