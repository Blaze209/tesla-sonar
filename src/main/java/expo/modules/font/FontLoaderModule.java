package expo.modules.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import co0.d;
import eb.a;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.m;
import p013kotlin.text.q;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lexpo/modules/font/FontLoaderModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "queryCustomNativeFonts", "", "", "expo-font_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FontLoaderModule extends Module {
    private final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> queryCustomNativeFonts() throws IOException {
        List<String> listC;
        AssetManager assets = getContext().getAssets();
        q qVar = new q("^(.+?)(_bold|_italic|_bold_italic)?\\.(ttf|otf)$");
        String[] list = assets.list("fonts/");
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                s.h(str);
                m mVarD = q.d(qVar, str, 0, 2, null);
                String str2 = (mVarD == null || (listC = mVarD.c()) == null) ? null : listC.get(1);
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (!t.y0((String) obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? v.m() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.util.List] */
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            final n0 n0Var = new n0();
            n0Var.f86529a = queryCustomNativeFonts();
            moduleDefinitionBuilder.Name("ExpoFontLoader");
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
            if (returnType == null) {
                returnType = new ReturnType(o0.b(Object.class));
                returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getLoadedFonts", new SyncFunctionComponent("getLoadedFonts", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.font.FontLoaderModule$definition$lambda$4$$inlined$FunctionWithoutArgs$1
                @Override // wn0.l
                public final Object invoke(Object[] it) {
                    s.k(it, "it");
                    return n0Var.f86529a;
                }
            }));
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = o0.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<co0.q>() { // from class: expo.modules.font.FontLoaderModule$definition$lambda$4$$inlined$AsyncFunction$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final co0.q invoke() {
                        return o0.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<co0.q>() { // from class: expo.modules.font.FontLoaderModule$definition$lambda$4$$inlined$AsyncFunction$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final co0.q invoke() {
                        return o0.o(String.class);
                    }
                }), converters);
            }
            AnyType[] anyTypeArr2 = {anyType, anyType2};
            l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.font.FontLoaderModule$definition$lambda$4$$inlined$AsyncFunction$3
                /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.List] */
                @Override // wn0.l
                public final h0 invoke(Object[] objArr) throws Exceptions.ReactContextLost, FileNotFoundException {
                    Typeface typefaceCreateFromFile;
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    String str2 = (String) obj;
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    if (reactContext == null) {
                        throw new Exceptions.ReactContextLost();
                    }
                    if (t.b0(str, "asset://", false, 2, null)) {
                        AssetManager assets = reactContext.getAssets();
                        String strSubstring = str.substring(9);
                        s.j(strSubstring, "substring(...)");
                        typefaceCreateFromFile = Typeface.createFromAsset(assets, strSubstring);
                        s.h(typefaceCreateFromFile);
                    } else {
                        String path = Uri.parse(str).getPath();
                        if (path == null) {
                            throw new FileNotFoundException(str);
                        }
                        typefaceCreateFromFile = Typeface.createFromFile(new File(path));
                        s.h(typefaceCreateFromFile);
                    }
                    kn.a.INSTANCE.c().h(str2, 0, typefaceCreateFromFile);
                    n0 n0Var2 = n0Var;
                    Set setQ1 = v.q1((Iterable) n0Var2.f86529a);
                    setQ1.add(str2);
                    n0Var2.f86529a = v.m1(setQ1);
                    return h0.f84049a;
                }
            };
            if (s.f(h0.class, Integer.TYPE)) {
                stringAsyncFunctionComponent = new IntAsyncFunctionComponent("loadAsync", anyTypeArr2, lVar);
            } else if (s.f(h0.class, Boolean.TYPE)) {
                stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("loadAsync", anyTypeArr2, lVar);
            } else if (s.f(h0.class, Double.TYPE)) {
                stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("loadAsync", anyTypeArr2, lVar);
            } else if (s.f(h0.class, Float.TYPE)) {
                stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("loadAsync", anyTypeArr2, lVar);
            } else {
                stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("loadAsync", anyTypeArr2, lVar) : new UntypedAsyncFunctionComponent("loadAsync", anyTypeArr2, lVar);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("loadAsync", stringAsyncFunctionComponent);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            a.f();
        }
    }
}
