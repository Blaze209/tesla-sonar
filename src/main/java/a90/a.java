package a90;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import b90.FetchPlaceResponse;
import b90.FindAutocompletePredictionsResponse;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.stripe.android.core.exception.StripeException;
import h70.h;
import java.util.ArrayList;
import java.util.List;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.tasks.TasksKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0011\u001a\u00020\bH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"La90/a;", "La90/b;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "client", "Lh70/h;", "errorReporter", "<init>", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lh70/h;)V", "", SearchIntents.EXTRA_QUERY, PlaceTypes.COUNTRY, "", "limit", "Ljn0/s;", "Lb90/f;", "b", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeId", "Lb90/e;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "c", "Lh70/h;", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "token", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements a90.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PlacesClient client;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h errorReporter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AutocompleteSessionToken token;

    /* JADX INFO: renamed from: a90.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.ui.core.elements.autocomplete.DefaultPlacesClientProxy", f = "PlacesClientProxy.kt", i = {0}, l = {137}, m = "fetchPlace-gIAlu-s", n = {"this"}, s = {"L$0"})
    static final class C0027a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f855n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f856o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f858q;

        C0027a(Continuation<? super C0027a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f856o = obj;
            this.f858q |= Integer.MIN_VALUE;
            Object objA = a.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.ui.core.elements.autocomplete.DefaultPlacesClientProxy", f = "PlacesClientProxy.kt", i = {0, 0}, l = {102}, m = "findAutocompletePredictions-BWLJW6A", n = {"this", "limit"}, s = {"L$0", "I$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f859n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f860o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f861p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f863r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f861p = obj;
            this.f863r |= Integer.MIN_VALUE;
            Object objB = a.this.b(null, null, 0, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : s.a(objB);
        }
    }

    public a(PlacesClient client, h errorReporter) {
        p013kotlin.jvm.internal.s.k(client, "client");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        this.client = client;
        this.errorReporter = errorReporter;
        this.token = AutocompleteSessionToken.newInstance();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a90.b
    public Object a(String str, Continuation<? super s<FetchPlaceResponse>> continuation) {
        C0027a c0027a;
        Exception exc;
        a aVar;
        ArrayList arrayList;
        List<AddressComponent> listAsList;
        if (continuation instanceof C0027a) {
            c0027a = (C0027a) continuation;
            int i11 = c0027a.f858q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0027a.f858q = i11 - Integer.MIN_VALUE;
            } else {
                c0027a = new C0027a(continuation);
            }
        } else {
            c0027a = new C0027a(continuation);
        }
        Object objAwait = c0027a.f856o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c0027a.f858q;
        if (i12 == 0) {
            t.b(objAwait);
            try {
                Task<com.google.android.libraries.places.api.net.FetchPlaceResponse> taskFetchPlace = this.client.fetchPlace(FetchPlaceRequest.newInstance(str, v.e(Place.Field.ADDRESS_COMPONENTS)));
                p013kotlin.jvm.internal.s.j(taskFetchPlace, "fetchPlace(...)");
                c0027a.f855n = this;
                c0027a.f858q = 1;
                objAwait = TasksKt.await(taskFetchPlace, c0027a);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = this;
            } catch (Exception e11) {
                exc = e11;
                aVar = this;
                h.b.a(aVar.errorReporter, h.d.PLACES_FETCH_PLACE_ERROR, StripeException.INSTANCE.b(exc), null, 4, null);
                s.Companion companion = s.INSTANCE;
                return s.b(t.a(new Exception("Could not fetch place: " + exc.getMessage())));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) c0027a.f855n;
            try {
                t.b(objAwait);
            } catch (Exception e12) {
                exc = e12;
                h.b.a(aVar.errorReporter, h.d.PLACES_FETCH_PLACE_ERROR, StripeException.INSTANCE.b(exc), null, 4, null);
                s.Companion companion2 = s.INSTANCE;
                return s.b(t.a(new Exception("Could not fetch place: " + exc.getMessage())));
            }
        }
        h.b.a(aVar.errorReporter, h.e.PLACES_FETCH_PLACE_SUCCESS, null, null, 6, null);
        s.Companion companion3 = s.INSTANCE;
        AddressComponents addressComponents = ((com.google.android.libraries.places.api.net.FetchPlaceResponse) objAwait).getPlace().getAddressComponents();
        if (addressComponents == null || (listAsList = addressComponents.asList()) == null) {
            arrayList = null;
        } else {
            List<AddressComponent> list = listAsList;
            arrayList = new ArrayList(v.y(list, 10));
            for (AddressComponent addressComponent : list) {
                String shortName = addressComponent.getShortName();
                String name = addressComponent.getName();
                p013kotlin.jvm.internal.s.j(name, "getName(...)");
                List<String> types = addressComponent.getTypes();
                p013kotlin.jvm.internal.s.j(types, "getTypes(...)");
                arrayList.add(new b90.AddressComponent(shortName, name, types));
            }
        }
        return s.b(new FetchPlaceResponse(new b90.Place(arrayList)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a90.b
    public Object b(String str, String str2, int i11, Continuation<? super s<FindAutocompletePredictionsResponse>> continuation) {
        b bVar;
        Exception exc;
        a aVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f863r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f863r = i12 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objAwait = bVar.f861p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bVar.f863r;
        if (i13 == 0) {
            t.b(objAwait);
            try {
                Task<com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse> taskFindAutocompletePredictions = this.client.findAutocompletePredictions(FindAutocompletePredictionsRequest.builder().setSessionToken(this.token).setQuery(str).setCountry(str2).setTypeFilter(TypeFilter.ADDRESS).build());
                p013kotlin.jvm.internal.s.j(taskFindAutocompletePredictions, "findAutocompletePredictions(...)");
                bVar.f859n = this;
                bVar.f860o = i11;
                bVar.f863r = 1;
                objAwait = TasksKt.await(taskFindAutocompletePredictions, bVar);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = this;
            } catch (Exception e11) {
                exc = e11;
                aVar = this;
                h.b.a(aVar.errorReporter, h.d.PLACES_FIND_AUTOCOMPLETE_ERROR, StripeException.INSTANCE.b(exc), null, 4, null);
                s.Companion companion = s.INSTANCE;
                return s.b(t.a(new Exception("Could not find autocomplete predictions: " + exc.getMessage())));
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = bVar.f860o;
            aVar = (a) bVar.f859n;
            try {
                t.b(objAwait);
            } catch (Exception e12) {
                exc = e12;
                h.b.a(aVar.errorReporter, h.d.PLACES_FIND_AUTOCOMPLETE_ERROR, StripeException.INSTANCE.b(exc), null, 4, null);
                s.Companion companion2 = s.INSTANCE;
                return s.b(t.a(new Exception("Could not find autocomplete predictions: " + exc.getMessage())));
            }
        }
        h.b.a(aVar.errorReporter, h.e.PLACES_FIND_AUTOCOMPLETE_SUCCESS, null, null, 6, null);
        s.Companion companion3 = s.INSTANCE;
        List<AutocompletePrediction> autocompletePredictions = ((com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) objAwait).getAutocompletePredictions();
        p013kotlin.jvm.internal.s.j(autocompletePredictions, "getAutocompletePredictions(...)");
        List<AutocompletePrediction> list = autocompletePredictions;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (AutocompletePrediction autocompletePrediction : list) {
            SpannableString primaryText = autocompletePrediction.getPrimaryText(new StyleSpan(1));
            p013kotlin.jvm.internal.s.j(primaryText, "getPrimaryText(...)");
            SpannableString secondaryText = autocompletePrediction.getSecondaryText(new StyleSpan(1));
            p013kotlin.jvm.internal.s.j(secondaryText, "getSecondaryText(...)");
            String placeId = autocompletePrediction.getPlaceId();
            p013kotlin.jvm.internal.s.j(placeId, "getPlaceId(...)");
            arrayList.add(new b90.AutocompletePrediction(primaryText, secondaryText, placeId));
        }
        return s.b(new FindAutocompletePredictionsResponse(v.d1(arrayList, i11)));
    }
}
