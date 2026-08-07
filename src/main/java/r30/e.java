package r30;

import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000f"}, d2 = {"Lr30/e;", "Lu30/a;", "Lr30/d;", "Lkotlin/Function0;", "", "timestampSupplier", "<init>", "(Lwn0/a;)V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lr30/d;", "Lwn0/a;", "c", "a", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements u30.a<FraudDetectionData> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f106945c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Long> timestampSupplier;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lr30/e$a;", "", "<init>", "()V", "", "FIELD_GUID", "Ljava/lang/String;", "FIELD_MUID", "FIELD_SID", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(wn0.a<Long> timestampSupplier) {
        s.k(timestampSupplier, "timestampSupplier");
        this.timestampSupplier = timestampSupplier;
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FraudDetectionData a(JSONObject json) {
        String strL;
        String strL2;
        s.k(json, "json");
        String strL3 = t30.e.l(json, "guid");
        if (strL3 == null || (strL = t30.e.l(json, "muid")) == null || (strL2 = t30.e.l(json, "sid")) == null) {
            return null;
        }
        return new FraudDetectionData(strL3, strL, strL2, this.timestampSupplier.invoke().longValue());
    }
}
