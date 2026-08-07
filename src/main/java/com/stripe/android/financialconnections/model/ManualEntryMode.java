package com.stripe.android.financialconnections.model;

import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "AUTOMATIC", "CUSTOM", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p(with = c.class)
public enum ManualEntryMode {
    AUTOMATIC("automatic"),
    CUSTOM("custom"),
    UNKNOWN("unknown");

    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50374c);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f50374c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ro0.d<Object> invoke() {
            return c.f50375e;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.ManualEntryMode$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntryMode$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ ro0.d a() {
            return (ro0.d) ManualEntryMode.$cachedSerializer$delegate.getValue();
        }

        public final ro0.d<ManualEntryMode> serializer() {
            return a();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntryMode$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends v30.a<ManualEntryMode> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f50375e = new c();

        private c() {
            super((Enum[]) ManualEntryMode.getEntries().toArray(new ManualEntryMode[0]), ManualEntryMode.UNKNOWN);
        }
    }

    ManualEntryMode(String str) {
        this.value = str;
    }

    public static EnumEntries<ManualEntryMode> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
