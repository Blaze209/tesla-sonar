package x60;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import java.util.Iterator;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/a;", "Lu30/a;", "Lcom/stripe/android/model/a;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/a;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements u30.a<AccountRange> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C2647a f122814b = new C2647a(null);

    /* JADX INFO: renamed from: x60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lx60/a$a;", "", "<init>", "()V", "", "FIELD_ACCOUNT_RANGE_HIGH", "Ljava/lang/String;", "FIELD_ACCOUNT_RANGE_LOW", "FIELD_BRAND", "FIELD_COUNTRY", "FIELD_PAN_LENGTH", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class C2647a {
        public /* synthetic */ C2647a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2647a() {
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AccountRange a(JSONObject json) {
        AccountRange.EnumC0883a next;
        p013kotlin.jvm.internal.s.k(json, "json");
        String strL = t30.e.l(json, "account_range_high");
        String strL2 = t30.e.l(json, "account_range_low");
        Integer numI = t30.e.f112281a.i(json, "pan_length");
        String strL3 = t30.e.l(json, "brand");
        Iterator<AccountRange.EnumC0883a> it = AccountRange.EnumC0883a.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f(next.getBrandName(), strL3));
        AccountRange.EnumC0883a enumC0883a = next;
        if (strL == null || strL2 == null || numI == null || enumC0883a == null) {
            return null;
        }
        return new AccountRange(new BinRange(strL2, strL), numI.intValue(), enumC0883a, t30.e.l(json, PlaceTypes.COUNTRY));
    }
}
