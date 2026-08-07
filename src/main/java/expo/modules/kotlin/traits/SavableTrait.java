package expo.modules.kotlin.traits;

import android.graphics.Bitmap;
import co0.d;
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
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.UUID;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.a;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000fB\u001d\b\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/traits/SavableTrait;", "InputType", "Lexpo/modules/kotlin/traits/Trait;", "Lkotlin/Function1;", "Lexpo/modules/kotlin/AppContext;", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "exportImpl", "<init>", "(Lwn0/l;)V", "appContext", "export", "(Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "Lwn0/l;", "getExportImpl", "()Lwn0/l;", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavableTrait<InputType> implements Trait<InputType> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final l<AppContext, ObjectDefinitionData> exportImpl;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\r\u001a\u00020\f\"\u0006\b\u0001\u0010\u0004\u0018\u0001\"\u0006\b\u0002\u0010\u0005\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062 \b\u0004\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\n0\bH\u0081\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0010\b\u0001\u0010\u0011\u0018\u0001*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/traits/SavableTrait$Companion;", "", "<init>", "()V", "InputType", "OptionType", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lkotlin/Function3;", "Ljava/io/File;", "Ljn0/h0;", "saveToFile", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "createImplementation", "(Lexpo/modules/kotlin/AppContext;Lwn0/q;)Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Landroid/graphics/Bitmap;", "T", "Lco0/d;", "klass", "Lexpo/modules/kotlin/traits/SavableTrait;", "create", "(Lco0/d;)Lexpo/modules/kotlin/traits/SavableTrait;", "SavableBitmapOptions", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/traits/SavableTrait$Companion$SavableBitmapOptions;", "Lexpo/modules/kotlin/records/Record;", "compression", "", "<init>", "(I)V", "getCompression", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SavableBitmapOptions implements Record {
            private final int compression;

            public SavableBitmapOptions() {
                this(0, 1, null);
            }

            public static /* synthetic */ SavableBitmapOptions copy$default(SavableBitmapOptions savableBitmapOptions, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = savableBitmapOptions.compression;
                }
                return savableBitmapOptions.copy(i11);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getCompression() {
                return this.compression;
            }

            public final SavableBitmapOptions copy(int compression) {
                return new SavableBitmapOptions(compression);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SavableBitmapOptions) && this.compression == ((SavableBitmapOptions) other).compression;
            }

            public final int getCompression() {
                return this.compression;
            }

            public int hashCode() {
                return Integer.hashCode(this.compression);
            }

            public String toString() {
                return "SavableBitmapOptions(compression=" + this.compression + ")";
            }

            public SavableBitmapOptions(int i11) {
                this.compression = i11;
            }

            public /* synthetic */ SavableBitmapOptions(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? 100 : i11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SavableTrait create$default(Companion companion, d klass, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                s.q(4, "T");
                klass = o0.b(SharedRef.class);
            }
            s.k(klass, "klass");
            s.p();
            return new SavableTrait(SavableTrait$Companion$create$1.INSTANCE);
        }

        public final /* synthetic */ <T extends SharedRef<Bitmap>> SavableTrait<T> create(d<T> klass) {
            s.k(klass, "klass");
            s.p();
            return new SavableTrait<>(SavableTrait$Companion$create$1.INSTANCE);
        }

        public final /* synthetic */ <InputType, OptionType> ObjectDefinitionData createImplementation(AppContext appContext, final q<? super File, ? super InputType, ? super OptionType, h0> saveToFile) {
            AsyncFunctionComponent stringAsyncFunctionComponent;
            s.k(appContext, "appContext");
            s.k(saveToFile, "saveToFile");
            final WeakReference weakReferenceWeak = UtilsKt.weak(appContext);
            ObjectDefinitionBuilder objectDefinitionBuilder = new ObjectDefinitionBuilder(null, 1, null);
            TypeConverterProvider converters = objectDefinitionBuilder.getConverters();
            s.q(4, "InputType");
            s.q(4, "OptionType");
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            s.q(4, "InputType");
            d dVarB = o0.b(Object.class);
            s.q(3, "InputType");
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType == null) {
                s.p();
                s.p();
                SavableTrait$Companion$createImplementation$$inlined$apply$lambda$1 savableTrait$Companion$createImplementation$$inlined$apply$lambda$1 = new a<co0.q>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$$inlined$apply$lambda$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final co0.q invoke() {
                        s.q(6, "InputType");
                        return null;
                    }
                };
                s.q(4, "InputType");
                d dVarB2 = o0.b(Object.class);
                s.q(3, "InputType");
                anyType = new AnyType(new LazyKType(dVarB2, false, savableTrait$Companion$createImplementation$$inlined$apply$lambda$1), converters);
            }
            s.q(4, "OptionType");
            d dVarB3 = o0.b(Object.class);
            s.q(3, "OptionType");
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
            if (anyType2 == null) {
                s.p();
                s.p();
                SavableTrait$Companion$createImplementation$$inlined$apply$lambda$2 savableTrait$Companion$createImplementation$$inlined$apply$lambda$2 = new a<co0.q>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$$inlined$apply$lambda$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final co0.q invoke() {
                        s.q(6, "OptionType");
                        return null;
                    }
                };
                s.q(4, "OptionType");
                d dVarB4 = o0.b(Object.class);
                s.q(3, "OptionType");
                anyType2 = new AnyType(new LazyKType(dVarB4, false, savableTrait$Companion$createImplementation$$inlined$apply$lambda$2), converters);
            }
            AnyType[] anyTypeArr = {anyType, anyType2};
            s.p();
            l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$lambda$1$$inlined$AsyncFunction$3
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
                    saveToFile.invoke(file, obj, obj2);
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

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavableTrait(l<? super AppContext, ObjectDefinitionData> exportImpl) {
        s.k(exportImpl, "exportImpl");
        this.exportImpl = exportImpl;
    }

    @Override // expo.modules.kotlin.traits.Trait
    public ObjectDefinitionData export(AppContext appContext) {
        s.k(appContext, "appContext");
        return this.exportImpl.invoke(appContext);
    }

    public final l<AppContext, ObjectDefinitionData> getExportImpl() {
        return this.exportImpl;
    }
}
