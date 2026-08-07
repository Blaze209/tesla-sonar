package a90;

import b90.FetchPlaceResponse;
import b90.FindAutocompletePredictionsResponse;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.libraries.places.api.model.PlaceTypes;
import h70.h;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"La90/c;", "La90/b;", "Lh70/h;", "errorReporter", "<init>", "(Lh70/h;)V", "", SearchIntents.EXTRA_QUERY, PlaceTypes.COUNTRY, "", "limit", "Ljn0/s;", "Lb90/f;", "b", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeId", "Lb90/e;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh70/h;", "getErrorReporter", "()Lh70/h;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h errorReporter;

    public c(h errorReporter) {
        s.k(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // a90.b
    public Object a(String str, Continuation<? super jn0.s<FetchPlaceResponse>> continuation) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        h.b.a(this.errorReporter, h.f.FETCH_PLACE_WITHOUT_DEPENDENCY, null, null, 6, null);
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(t.a(illegalStateException));
    }

    @Override // a90.b
    public Object b(String str, String str2, int i11, Continuation<? super jn0.s<FindAutocompletePredictionsResponse>> continuation) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        h.b.a(this.errorReporter, h.f.FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY, null, null, 6, null);
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(t.a(illegalStateException));
    }
}
