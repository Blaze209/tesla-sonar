package expo.modules.font;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.q;
import eb.a;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import sn0.b;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/font/FontUtilsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-font_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FontUtilsModule extends Module {
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
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoFontUtils");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = o0.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.font.FontUtilsModule$definition$lambda$4$$inlined$AsyncFunctionWithPromise$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(RenderToImageOptions.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(RenderToImageOptions.class), false, new wn0.a<q>() { // from class: expo.modules.font.FontUtilsModule$definition$lambda$4$$inlined$AsyncFunctionWithPromise$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(RenderToImageOptions.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("renderToImageAsync", new AsyncFunctionWithPromiseComponent("renderToImageAsync", new AnyType[]{anyType, anyType2}, new p<Object[], Promise, h0>() { // from class: expo.modules.font.FontUtilsModule$definition$lambda$4$$inlined$AsyncFunctionWithPromise$3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) throws IOException {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    Object obj = objArr[0];
                    RenderToImageOptions renderToImageOptions = (RenderToImageOptions) objArr[1];
                    String str = (String) obj;
                    Typeface typefaceE = kn.a.INSTANCE.c().e(renderToImageOptions.getFontFamily(), 0, this.this$0.getContext().getAssets());
                    Paint paint = new Paint();
                    paint.setTypeface(typefaceE);
                    paint.setColor(renderToImageOptions.getColor());
                    paint.setTextSize(renderToImageOptions.getSize());
                    paint.setAntiAlias(true);
                    Rect rect = new Rect();
                    paint.getTextBounds(str, 0, str.length(), rect);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                    s.j(bitmapCreateBitmap, "createBitmap(...)");
                    float f11 = 2;
                    new Canvas(bitmapCreateBitmap).drawText(str, Math.abs(rect.left), (rect.height() / f11) - ((paint.getFontMetrics().ascent + paint.getFontMetrics().descent) / f11), paint);
                    File file = new File(this.this$0.getContext().getCacheDir(), UUID.randomUUID() + ".png");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            promise.resolve(Uri.fromFile(file));
                            h0 h0Var = h0.f84049a;
                            b.a(fileOutputStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                b.a(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (IOException e11) {
                        String absolutePath = file.getAbsolutePath();
                        s.j(absolutePath, "getAbsolutePath(...)");
                        promise.reject(new SaveImageException(absolutePath, e11));
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws IOException {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            a.f();
        }
    }
}
