package z00;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.reactnativedocumentpicker.NativeDocumentPickerSpec;
import com.reactnativedocumentpicker.RNDocumentPickerModule;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lz00/k;", "Lcom/facebook/react/a;", "<init>", "()V", "", "name", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;", "Lyn/a;", "getReactModuleInfoProvider", "()Lyn/a;", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends com.facebook.react.a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        return v0.f(x.a(NativeDocumentPickerSpec.NAME, new ReactModuleInfo(NativeDocumentPickerSpec.NAME, NativeDocumentPickerSpec.NAME, false, false, false, false)));
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        s.k(name, "name");
        s.k(reactContext, "reactContext");
        if (s.f(name, NativeDocumentPickerSpec.NAME)) {
            return new RNDocumentPickerModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new yn.a() { // from class: z00.j
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return k.getReactModuleInfoProvider$lambda$0();
            }
        };
    }
}
