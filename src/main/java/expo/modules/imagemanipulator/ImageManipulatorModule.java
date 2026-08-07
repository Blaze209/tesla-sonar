package expo.modules.imagemanipulator;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.q;
import co0.s;
import com.google.android.gms.common.internal.ImagesContract;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import eb.a;
import expo.modules.imagemanipulator.transformers.CropTransformer;
import expo.modules.imagemanipulator.transformers.FlipTransformer;
import expo.modules.imagemanipulator.transformers.ResizeTransformer;
import expo.modules.imagemanipulator.transformers.RotateTransformer;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.EitherOfThree;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lexpo/modules/imagemanipulator/ImageManipulatorModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "createManipulatorContext", "Lexpo/modules/imagemanipulator/ImageManipulatorContext;", ImagesContract.URL, "Landroid/net/Uri;", "bitmap", "Landroid/graphics/Bitmap;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-image-manipulator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageManipulatorModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final ImageManipulatorContext createManipulatorContext(Uri url) {
        return new ImageManipulatorContext(getRuntimeContext(), new ManipulatorTask(getAppContext().getBackgroundCoroutineScope(), new ImageManipulatorModule$createManipulatorContext$loader$1(this, url, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AnyType anyType;
        AnyType anyType2;
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoImageManipulator");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = o0.b(EitherOfThree.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(o0.b(EitherOfThree.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$$inlined$Function$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        s.Companion companion = s.INSTANCE;
                        return o0.r(EitherOfThree.class, companion.d(o0.o(Uri.class)), companion.d(o0.p(SharedRef.class, companion.d(o0.o(Bitmap.class)))), companion.d(o0.p(SharedRef.class, companion.d(o0.o(Drawable.class)))));
                    }
                }), converters);
            }
            AnyType[] anyTypeArr = {anyType3};
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(ImageManipulatorContext.class));
            if (returnType == null) {
                returnType = new ReturnType(o0.b(ImageManipulatorContext.class));
                returnTypeProvider.getTypes().put(o0.b(ImageManipulatorContext.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("manipulate", new SyncFunctionComponent("manipulate", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$$inlined$Function$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // wn0.l
                public final Object invoke(Object[] objArr) throws Exceptions.IllegalArgument {
                    Bitmap bitmap;
                    p013kotlin.jvm.internal.s.k(objArr, "<destruct>");
                    EitherOfThree eitherOfThree = (EitherOfThree) objArr[0];
                    if (eitherOfThree.isFirstType(o0.b(Uri.class))) {
                        return this.this$0.createManipulatorContext((Uri) eitherOfThree.getFirstType(o0.b(Uri.class)));
                    }
                    if (eitherOfThree.isSecondType(o0.b(SharedRef.class))) {
                        return this.this$0.createManipulatorContext((Bitmap) ((SharedRef) eitherOfThree.getSecondType(o0.b(SharedRef.class))).getRef());
                    }
                    Drawable drawable = (Drawable) ((SharedRef) eitherOfThree.getThirdType(o0.b(SharedRef.class))).getRef();
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                        throw new Exceptions.IllegalArgument("The drawable cannot be converted to a bitmap", null, 2, null);
                    }
                    return this.this$0.createManipulatorContext(bitmap);
                }
            }));
            d dVarB2 = o0.b(ImageManipulatorContext.class);
            Module module = moduleDefinitionBuilder.getModule();
            if (module == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AppContext appContext = module.getAppContext();
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(ImageManipulatorContext.class), bool));
            if (anyType4 == null) {
                anyType = new AnyType(new LazyKType(o0.b(ImageManipulatorContext.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$$inlined$Class$default$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImageManipulatorContext.class);
                    }
                }), null);
            } else {
                anyType = anyType4;
            }
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, "Context", dVarB2, anyType, moduleDefinitionBuilder.getConverters());
            TypeConverterProvider converters2 = classComponentBuilder.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r7), bool));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(o0.b(Uri.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Constructor$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Uri.class);
                    }
                }), converters2);
            }
            AnyType[] anyTypeArr2 = {anyType5};
            ReturnType returnType2 = returnTypeProvider.getTypes().get(o0.b(r9));
            if (returnType2 == null) {
                returnType2 = new ReturnType(o0.b(r9));
                returnTypeProvider.getTypes().put(o0.b(Object.class), returnType2);
            }
            classComponentBuilder.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr2, returnType2, new l<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Constructor$2
                @Override // wn0.l
                public final Object invoke(Object[] objArr) {
                    p013kotlin.jvm.internal.s.k(objArr, "<destruct>");
                    return this.this$0.createManipulatorContext((Uri) objArr[0]);
                }
            }));
            TypeConverterProvider converters3 = classComponentBuilder.getConverters();
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(ImageManipulatorContext.class), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(o0.b(ImageManipulatorContext.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImageManipulatorContext.class);
                    }
                }), converters3);
            }
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r6), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(o0.b(ResizeOptions.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ResizeOptions.class);
                    }
                }), converters3);
            }
            AnyType[] anyTypeArr3 = {anyType6, anyType7};
            ReturnType returnType3 = returnTypeProvider.getTypes().get(o0.b(ImageManipulatorContext.class));
            if (returnType3 == null) {
                returnType3 = new ReturnType(o0.b(ImageManipulatorContext.class));
                returnTypeProvider.getTypes().put(o0.b(ImageManipulatorContext.class), returnType3);
            }
            classComponentBuilder.getSyncFunctions().put("resize", new SyncFunctionComponent("resize", anyTypeArr3, returnType3, new l<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$3
                @Override // wn0.l
                public final Object invoke(Object[] objArr) {
                    p013kotlin.jvm.internal.s.k(objArr, "<destruct>");
                    return ((ImageManipulatorContext) objArr[0]).addTransformer(new ResizeTransformer((ResizeOptions) objArr[1]));
                }
            }));
            TypeConverterProvider converters4 = classComponentBuilder.getConverters();
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(ImageManipulatorContext.class), bool));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(o0.b(ImageManipulatorContext.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImageManipulatorContext.class);
                    }
                }), converters4);
            }
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Float.class), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(o0.b(Float.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Float.TYPE);
                    }
                }), converters4);
            }
            AnyType[] anyTypeArr4 = {anyType8, anyType9};
            ReturnType returnType4 = returnTypeProvider.getTypes().get(o0.b(ImageManipulatorContext.class));
            if (returnType4 == null) {
                returnType4 = new ReturnType(o0.b(ImageManipulatorContext.class));
                returnTypeProvider.getTypes().put(o0.b(ImageManipulatorContext.class), returnType4);
            }
            classComponentBuilder.getSyncFunctions().put("rotate", new SyncFunctionComponent("rotate", anyTypeArr4, returnType4, new l<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$6
                @Override // wn0.l
                public final Object invoke(Object[] objArr) {
                    p013kotlin.jvm.internal.s.k(objArr, "<destruct>");
                    return ((ImageManipulatorContext) objArr[0]).addTransformer(new RotateTransformer(((Number) objArr[1]).floatValue()));
                }
            }));
            TypeConverterProvider converters5 = classComponentBuilder.getConverters();
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(ImageManipulatorContext.class), bool));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(o0.b(ImageManipulatorContext.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImageManipulatorContext.class);
                    }
                }), converters5);
            }
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(FlipType.class), bool));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(o0.b(FlipType.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(FlipType.class);
                    }
                }), converters5);
            }
            AnyType[] anyTypeArr5 = {anyType10, anyType11};
            ReturnType returnType5 = returnTypeProvider.getTypes().get(o0.b(ImageManipulatorContext.class));
            if (returnType5 == null) {
                returnType5 = new ReturnType(o0.b(ImageManipulatorContext.class));
                returnTypeProvider.getTypes().put(o0.b(ImageManipulatorContext.class), returnType5);
            }
            classComponentBuilder.getSyncFunctions().put("flip", new SyncFunctionComponent("flip", anyTypeArr5, returnType5, new l<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$9
                @Override // wn0.l
                public final Object invoke(Object[] objArr) {
                    p013kotlin.jvm.internal.s.k(objArr, "<destruct>");
                    return ((ImageManipulatorContext) objArr[0]).addTransformer(new FlipTransformer((FlipType) objArr[1]));
                }
            }));
            TypeConverterProvider converters6 = classComponentBuilder.getConverters();
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(ImageManipulatorContext.class), bool));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(o0.b(ImageManipulatorContext.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$10
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImageManipulatorContext.class);
                    }
                }), converters6);
            }
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(CropRect.class), bool));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(o0.b(CropRect.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$11
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(CropRect.class);
                    }
                }), converters6);
            }
            AnyType[] anyTypeArr6 = {anyType12, anyType13};
            ReturnType returnType6 = returnTypeProvider.getTypes().get(o0.b(ImageManipulatorContext.class));
            if (returnType6 == null) {
                returnType6 = new ReturnType(o0.b(ImageManipulatorContext.class));
                returnTypeProvider.getTypes().put(o0.b(ImageManipulatorContext.class), returnType6);
            }
            classComponentBuilder.getSyncFunctions().put("crop", new SyncFunctionComponent("crop", anyTypeArr6, returnType6, new l<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$12
                @Override // wn0.l
                public final Object invoke(Object[] objArr) {
                    p013kotlin.jvm.internal.s.k(objArr, "<destruct>");
                    return ((ImageManipulatorContext) objArr[0]).addTransformer(new CropTransformer((CropRect) objArr[1]));
                }
            }));
            TypeConverterProvider converters7 = classComponentBuilder.getConverters();
            AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(ImageManipulatorContext.class), bool));
            if (anyType14 == null) {
                anyType14 = new AnyType(new LazyKType(o0.b(ImageManipulatorContext.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$13
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImageManipulatorContext.class);
                    }
                }), converters7);
            }
            AnyType[] anyTypeArr7 = {anyType14};
            ReturnType returnType7 = returnTypeProvider.getTypes().get(o0.b(ImageManipulatorContext.class));
            if (returnType7 == null) {
                returnType7 = new ReturnType(o0.b(ImageManipulatorContext.class));
                returnTypeProvider.getTypes().put(o0.b(ImageManipulatorContext.class), returnType7);
            }
            classComponentBuilder.getSyncFunctions().put("reset", new SyncFunctionComponent("reset", anyTypeArr7, returnType7, new l<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$14
                @Override // wn0.l
                public final Object invoke(Object[] objArr) {
                    p013kotlin.jvm.internal.s.k(objArr, "<destruct>");
                    return ((ImageManipulatorContext) objArr[0]).reset();
                }
            }));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = classComponentBuilder.AsyncFunction("renderAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters8 = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(ImageManipulatorContext.class), bool));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(o0.b(ImageManipulatorContext.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImageManipulatorContext.class);
                    }
                }), converters8);
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType15}, new ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2(null, this)));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
            d dVarB3 = o0.b(r10);
            Module module2 = moduleDefinitionBuilder.getModule();
            if (module2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AppContext appContext2 = module2.getAppContext();
            AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r10), bool));
            if (anyType16 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(ImageRef.class), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$$inlined$Class$default$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImageRef.class);
                    }
                }), null);
            } else {
                anyType2 = anyType16;
            }
            ClassComponentBuilder classComponentBuilder2 = new ClassComponentBuilder(appContext2, "Image", dVarB3, anyType2, moduleDefinitionBuilder.getConverters());
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), Snapshot.WIDTH);
            AnyType[] anyTypeArr8 = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
            ReturnType returnType8 = returnTypeProvider.getTypes().get(o0.b(r11));
            if (returnType8 == null) {
                returnType8 = new ReturnType(o0.b(r11));
                returnTypeProvider.getTypes().put(o0.b(Integer.class), returnType8);
            }
            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr8, returnType8, new l<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Property$1
                @Override // wn0.l
                public final Object invoke(Object[] it) {
                    p013kotlin.jvm.internal.s.k(it, "it");
                    return Integer.valueOf(((ImageRef) it[0]).getRef().getWidth());
                }
            });
            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
            syncFunctionComponent.setCanTakeOwner(true);
            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
            classComponentBuilder2.getProperties().put(Snapshot.WIDTH, propertyComponentBuilderWithThis);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2 = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), Snapshot.HEIGHT);
            AnyType[] anyTypeArr9 = {new AnyType(propertyComponentBuilderWithThis2.getThisType(), null, 2, null)};
            ReturnType returnType9 = returnTypeProvider.getTypes().get(o0.b(r11));
            if (returnType9 == null) {
                returnType9 = new ReturnType(o0.b(r11));
                returnTypeProvider.getTypes().put(o0.b(r11), returnType9);
            }
            SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent("get", anyTypeArr9, returnType9, new l<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Property$2
                @Override // wn0.l
                public final Object invoke(Object[] it) {
                    p013kotlin.jvm.internal.s.k(it, "it");
                    return Integer.valueOf(((ImageRef) it[0]).getRef().getHeight());
                }
            });
            syncFunctionComponent2.setOwnerType(propertyComponentBuilderWithThis2.getThisType());
            syncFunctionComponent2.setCanTakeOwner(true);
            propertyComponentBuilderWithThis2.setGetter(syncFunctionComponent2);
            classComponentBuilder2.getProperties().put(Snapshot.HEIGHT, propertyComponentBuilderWithThis2);
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = classComponentBuilder2.AsyncFunction("saveAsync");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters9 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType17 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r10), bool));
            if (anyType17 == null) {
                anyType17 = new AnyType(new LazyKType(o0.b(r10), false, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(ImageRef.class);
                    }
                }), converters9);
            }
            AnyType anyType18 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(ManipulateOptions.class), Boolean.TRUE));
            if (anyType18 == null) {
                anyType18 = new AnyType(new LazyKType(o0.b(ManipulateOptions.class), true, new wn0.a<q>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(ManipulateOptions.class);
                    }
                }), converters9);
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType17, anyType18}, new ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3(null, this)));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder2.buildClass());
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th2) {
            a.f();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageManipulatorContext createManipulatorContext(Bitmap bitmap) {
        return new ImageManipulatorContext(getRuntimeContext(), new ManipulatorTask(getAppContext().getBackgroundCoroutineScope(), new ImageManipulatorModule$createManipulatorContext$task$1(bitmap, null)));
    }
}
