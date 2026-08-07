package x60;

import com.stripe.android.model.Token;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/f0;", "Lu30/a;", "Lcom/stripe/android/model/p1;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/p1;", "a", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f0 implements u30.a<Token> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f122838b = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lx60/f0$a;", "", "<init>", "()V", "", "FIELD_CREATED", "Ljava/lang/String;", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_TYPE", "FIELD_USED", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122839a;

        static {
            int[] iArr = new int[Token.c.values().length];
            try {
                iArr[Token.c.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Token.c.BankAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f122839a = iArr;
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Token a(JSONObject json) {
        p013kotlin.jvm.internal.s.k(json, "json");
        String strL = t30.e.l(json, "id");
        t30.e eVar = t30.e.f112281a;
        Long lJ = eVar.j(json, "created");
        Token.c cVarA = Token.c.INSTANCE.a(t30.e.l(json, "type"));
        if (cVarA == null || strL == null || lJ == null) {
            return null;
        }
        boolean zF = eVar.f(json, "used");
        boolean zF2 = eVar.f(json, "livemode");
        Date date = new Date(TimeUnit.SECONDS.toMillis(lJ.longValue()));
        int i11 = b.f122839a[cVarA.ordinal()];
        if (i11 == 1) {
            Token.c cVar = Token.c.Card;
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(cVar.getCode());
            if (jSONObjectOptJSONObject != null) {
                return new Token(strL, cVar, date, zF2, zF, null, new e().a(jSONObjectOptJSONObject), 32, null);
            }
            return null;
        }
        if (i11 != 2) {
            return new Token(strL, cVarA, date, zF2, zF, null, null, 96, null);
        }
        Token.c cVar2 = Token.c.BankAccount;
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(cVar2.getCode());
        if (jSONObjectOptJSONObject2 != null) {
            return new Token(strL, cVar2, date, zF2, zF, new d().a(jSONObjectOptJSONObject2), null, 64, null);
        }
        return null;
    }
}
