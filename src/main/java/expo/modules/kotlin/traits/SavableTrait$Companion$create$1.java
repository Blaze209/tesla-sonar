package expo.modules.kotlin.traits;

import android.graphics.Bitmap;
import co0.d;
import co0.q;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.objects.ObjectDefinitionBuilder;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.UUID;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.a;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class SavableTrait$Companion$create$1 implements l<AppContext, ObjectDefinitionData> {
    public static final SavableTrait$Companion$create$1 INSTANCE = new SavableTrait$Companion$create$1();

    @Override // wn0.l
    public final ObjectDefinitionData invoke(AppContext appContext) {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        s.k(appContext, "appContext");
        SavableTrait.Companion companion = SavableTrait.INSTANCE;
        final WeakReference weakReferenceWeak = UtilsKt.weak(appContext);
        ObjectDefinitionBuilder objectDefinitionBuilder = new ObjectDefinitionBuilder(null, 1, null);
        TypeConverterProvider converters = objectDefinitionBuilder.getConverters();
        s.q(4, "T");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "T");
        d dVarB = o0.b(Object.class);
        s.q(3, "T");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$1 savableTrait$Companion$create$1$invoke$$inlined$createImplementation$1 = new a<q>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "T");
                    return null;
                }
            };
            s.q(4, "T");
            d dVarB2 = o0.b(Object.class);
            s.q(3, "T");
            anyType = new AnyType(new LazyKType(dVarB2, false, savableTrait$Companion$create$1$invoke$$inlined$createImplementation$1), converters);
        }
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(SavableTrait.Companion.SavableBitmapOptions.class), Boolean.FALSE));
        if (anyType2 == null) {
            anyType2 = new AnyType(new LazyKType(o0.b(SavableTrait.Companion.SavableBitmapOptions.class), false, new a<q>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    return o0.o(SavableTrait.Companion.SavableBitmapOptions.class);
                }
            }), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        s.p();
        l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$3
            @Override // wn0.l
            public final h0 invoke(Object[] objArr) throws IOException, Exceptions.AppContextLost {
                s.k(objArr, "<destruct>");
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                AppContext appContext2 = (AppContext) weakReferenceWeak.get();
                if (appContext2 == null) {
                    throw new Exceptions.AppContextLost();
                }
                File file = new File(appContext2.getCacheDirectory(), UUID.randomUUID().toString());
                file.createNewFile();
                SharedRef sharedRef = (SharedRef) obj;
                sharedRef.getAppContext();
                ((Bitmap) sharedRef.getRef()).compress(Bitmap.CompressFormat.PNG, ((SavableTrait.Companion.SavableBitmapOptions) obj2).getCompression(), new FileOutputStream(file));
                return h0.f84049a;
            }
        };
        if (s.f(h0.class, Integer.TYPE)) {
            stringAsyncFunctionComponent = new IntAsyncFunctionComponent("saveAsync", anyTypeArr, lVar);
        } else if (s.f(h0.class, Boolean.TYPE)) {
            stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("saveAsync", anyTypeArr, lVar);
        } else if (s.f(h0.class, Double.TYPE)) {
            stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("saveAsync", anyTypeArr, lVar);
        } else if (s.f(h0.class, Float.TYPE)) {
            stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("saveAsync", anyTypeArr, lVar);
        } else {
            stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("saveAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("saveAsync", anyTypeArr, lVar);
        }
        objectDefinitionBuilder.getAsyncFunctions().put("saveAsync", stringAsyncFunctionComponent);
        return objectDefinitionBuilder.buildObject();
    }
}
