package a90;

import android.content.Context;
import b90.FetchPlaceResponse;
import b90.FindAutocompletePredictionsResponse;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.net.PlacesClient;
import h70.h;
import jn0.h0;
import p010i90.i0;
import p010i90.w;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u000b\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"La90/b;", "", "", SearchIntents.EXTRA_QUERY, PlaceTypes.COUNTRY, "", "limit", "Ljn0/s;", "Lb90/f;", "b", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeId", "Lb90/e;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f865a;

    /* JADX INFO: renamed from: a90.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"La90/b$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "googlePlacesApiKey", "Li90/i0;", "isPlacesAvailable", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "clientFactory", "Lkotlin/Function0;", "Ljn0/h0;", "initializer", "Lh70/h;", "errorReporter", "La90/b;", "a", "(Landroid/content/Context;Ljava/lang/String;Li90/i0;Lwn0/l;Lwn0/a;Lh70/h;)La90/b;", "", "isSystemDarkTheme", "", "c", "(ZLi90/i0;)Ljava/lang/Integer;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f865a = new Companion();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: a90.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/content/Context;", "it", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "kotlin.jvm.PlatformType", "a", "(Landroid/content/Context;)Lcom/google/android/libraries/places/api/net/PlacesClient;"}, k = 3, mv = {1, 9, 0})
        public static final class C0028a extends u implements l<Context, PlacesClient> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f866c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0028a(Context context) {
                super(1);
                this.f866c = context;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlacesClient invoke(Context it) {
                s.k(it, "it");
                PlacesClient placesClientCreateClient = Places.createClient(this.f866c);
                s.j(placesClientCreateClient, "createClient(...)");
                return placesClientCreateClient;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: a90.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class C0029b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f867c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f868d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0029b(Context context, String str) {
                super(0);
                this.f867c = context;
                this.f868d = str;
            }

            public final void b() {
                Places.initialize(this.f867c, this.f868d);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b b(Companion companion, Context context, String str, i0 i0Var, l lVar, wn0.a aVar, h hVar, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                i0Var = new w();
            }
            i0 i0Var2 = i0Var;
            if ((i11 & 8) != 0) {
                lVar = new C0028a(context);
            }
            l lVar2 = lVar;
            if ((i11 & 16) != 0) {
                aVar = new C0029b(context, str);
            }
            return companion.a(context, str, i0Var2, lVar2, aVar, hVar);
        }

        public static /* synthetic */ Integer d(Companion companion, boolean z11, i0 i0Var, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i0Var = new w();
            }
            return companion.c(z11, i0Var);
        }

        public final b a(Context context, String googlePlacesApiKey, i0 isPlacesAvailable, l<? super Context, ? extends PlacesClient> clientFactory, wn0.a<h0> initializer, h errorReporter) {
            s.k(context, "context");
            s.k(googlePlacesApiKey, "googlePlacesApiKey");
            s.k(isPlacesAvailable, "isPlacesAvailable");
            s.k(clientFactory, "clientFactory");
            s.k(initializer, "initializer");
            s.k(errorReporter, "errorReporter");
            if (!isPlacesAvailable.invoke()) {
                return new c(errorReporter);
            }
            initializer.invoke();
            return new a(clientFactory.invoke(context), errorReporter);
        }

        public final Integer c(boolean isSystemDarkTheme, i0 isPlacesAvailable) {
            s.k(isPlacesAvailable, "isPlacesAvailable");
            if (isPlacesAvailable.invoke()) {
                return Integer.valueOf(isSystemDarkTheme ? R.drawable.places_powered_by_google_dark : R.drawable.places_powered_by_google_light);
            }
            return null;
        }
    }

    Object a(String str, Continuation<? super jn0.s<FetchPlaceResponse>> continuation);

    Object b(String str, String str2, int i11, Continuation<? super jn0.s<FindAutocompletePredictionsResponse>> continuation);
}
