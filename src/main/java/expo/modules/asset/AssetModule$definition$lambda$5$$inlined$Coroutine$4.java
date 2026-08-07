package expo.modules.asset;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.plaid.internal.EnumC4419g;
import expo.modules.core.errors.ModuleNotFoundException;
import expo.modules.kotlin.AppContext;
import java.io.File;
import java.net.URI;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.asset.AssetModule$definition$lambda$5$$inlined$Coroutine$4", f = "AssetModule.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE}, m = "invokeSuspend", n = {}, s = {})
public final class AssetModule$definition$lambda$5$$inlined$Coroutine$4 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetModule$definition$lambda$5$$inlined$Coroutine$4(Continuation continuation, AssetModule assetModule) {
        super(3, continuation);
        this.this$0 = assetModule;
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ModuleNotFoundException, UnableToDownloadAssetException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                t.b(obj);
                return obj;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return obj;
        }
        t.b(obj);
        Object[] objArr = (Object[]) this.L$0;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) obj3;
        URI uri = (URI) obj2;
        if (uri.getScheme() == Action.FILE_ATTRIBUTE) {
            String string = uri.toString();
            s.j(string, "toString(...)");
            if (!p013kotlin.text.t.b0(string, ResourceAssetKt.ANDROID_EMBEDDED_URL_BASE_RESOURCE, false, 2, null)) {
                return uri;
            }
        }
        String mD5HashOfFilePath = str2 == null ? this.this$0.getMD5HashOfFilePath(uri) : str2;
        File file = new File(this.this$0.getAppContext().getCacheDirectory() + "/ExponentAsset-" + mD5HashOfFilePath + "." + str);
        if (!file.exists()) {
            AssetModule assetModule = this.this$0;
            AppContext appContext = assetModule.getAppContext();
            this.label = 1;
            Object objDownloadAsset = assetModule.downloadAsset(appContext, uri, file, this);
            if (objDownloadAsset != coroutine_suspended) {
                return objDownloadAsset;
            }
        } else {
            if (str2 == null || s.f(str2, this.this$0.getMD5HashOfFileContent(file))) {
                return Uri.fromFile(file);
            }
            AssetModule assetModule2 = this.this$0;
            AppContext appContext2 = assetModule2.getAppContext();
            this.label = 2;
            Object objDownloadAsset2 = assetModule2.downloadAsset(appContext2, uri, file, this);
            if (objDownloadAsset2 != coroutine_suspended) {
                return objDownloadAsset2;
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        AssetModule$definition$lambda$5$$inlined$Coroutine$4 assetModule$definition$lambda$5$$inlined$Coroutine$4 = new AssetModule$definition$lambda$5$$inlined$Coroutine$4(continuation, this.this$0);
        assetModule$definition$lambda$5$$inlined$Coroutine$4.L$0 = objArr;
        return assetModule$definition$lambda$5$$inlined$Coroutine$4.invokeSuspend(h0.f84049a);
    }
}
