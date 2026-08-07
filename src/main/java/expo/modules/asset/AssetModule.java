package expo.modules.asset;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import co0.q;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import expo.modules.interfaces.filesystem.FilePermissionModuleInterface;
import expo.modules.interfaces.filesystem.Permission;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.EnumSet;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.d;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lexpo/modules/asset/AssetModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getMD5HashOfFilePath", "", "uri", "Ljava/net/URI;", "getMD5HashOfFileContent", Action.FILE_ATTRIBUTE, "Ljava/io/File;", "downloadAsset", "Landroid/net/Uri;", "appContext", "Lexpo/modules/kotlin/AppContext;", "localUrl", "(Lexpo/modules/kotlin/AppContext;Ljava/net/URI;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-asset_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AssetModule extends Module {

    /* JADX INFO: renamed from: expo.modules.asset.AssetModule$downloadAsset$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.asset.AssetModule", f = "AssetModule.kt", i = {}, l = {56}, m = "downloadAsset", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetModule.this.downloadAsset(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.asset.AssetModule$downloadAsset$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.asset.AssetModule$downloadAsset$2", f = "AssetModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, Continuation<? super Uri>, Object> {
        final /* synthetic */ File $localUrl;
        final /* synthetic */ URI $uri;
        int label;
        final /* synthetic */ AssetModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(URI uri, AssetModule assetModule, File file, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.this$0 = assetModule;
            this.$localUrl = file;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$uri, this.this$0, this.$localUrl, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UnableToDownloadAssetException {
            InputStream inputStreamOpenStream;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                String string = this.$uri.toString();
                s.j(string, "toString(...)");
                if (p013kotlin.text.t.h0(string, ":", false, 2, null)) {
                    String string2 = this.$uri.toString();
                    s.j(string2, "toString(...)");
                    if (p013kotlin.text.t.b0(string2, ResourceAssetKt.ANDROID_EMBEDDED_URL_BASE_RESOURCE, false, 2, null)) {
                        Context context = this.this$0.getContext();
                        String string3 = this.$uri.toString();
                        s.j(string3, "toString(...)");
                        inputStreamOpenStream = ResourceAssetKt.openAndroidResStream(context, string3);
                    } else {
                        inputStreamOpenStream = FirebasePerfUrlConnection.openStream(this.$uri.toURL());
                    }
                } else {
                    Context context2 = this.this$0.getContext();
                    String string4 = this.$uri.toString();
                    s.j(string4, "toString(...)");
                    inputStreamOpenStream = ResourceAssetKt.openAssetResourceStream(context2, string4);
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.$localUrl);
                    try {
                        s.h(inputStreamOpenStream);
                        sn0.a.b(inputStreamOpenStream, fileOutputStream, 0, 2, null);
                        sn0.b.a(fileOutputStream, null);
                        sn0.b.a(inputStreamOpenStream, null);
                        return Uri.fromFile(this.$localUrl);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            sn0.b.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        sn0.b.a(inputStreamOpenStream, th4);
                        throw th5;
                    }
                }
            } catch (Exception unused) {
                String string5 = this.$uri.toString();
                s.j(string5, "toString(...)");
                throw new UnableToDownloadAssetException(string5);
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object downloadAsset(AppContext appContext, URI uri, File file, Continuation<? super Uri> continuation) throws UnableToDownloadAssetException {
        AnonymousClass1 anonymousClass1;
        EnumSet<Permission> pathPermissions;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objWithContext = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anonymousClass1.label;
        if (i12 == 0) {
            t.b(objWithContext);
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                file.mkdirs();
            }
            FilePermissionModuleInterface filePermission = appContext.getFilePermission();
            if (filePermission == null || (pathPermissions = filePermission.getPathPermissions(appContext.getReactContext(), file.getParent())) == null || !pathPermissions.contains(Permission.WRITE)) {
                String string = uri.toString();
                s.j(string, "toString(...)");
                throw new UnableToDownloadAssetException(string);
            }
            CoroutineContext coroutineContext = appContext.getBackgroundCoroutineScope().getCoroutineContext();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(uri, this, file, null);
            anonymousClass1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, anonymousClass2, anonymousClass1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        s.j(objWithContext, "withContext(...)");
        return objWithContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.AppContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.AppContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMD5HashOfFileContent(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, MessageDigest.getInstance("MD5"));
                try {
                    byte[] bArrDigest = digestInputStream.getMessageDigest().digest();
                    s.j(bArrDigest, "digest(...)");
                    String strP0 = n.P0(bArrDigest, "", null, null, 0, null, new l() { // from class: expo.modules.asset.a
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AssetModule.getMD5HashOfFileContent$lambda$3$lambda$2$lambda$1(((Byte) obj).byteValue());
                        }
                    }, 30, null);
                    sn0.b.a(digestInputStream, null);
                    sn0.b.a(fileInputStream, null);
                    return strP0;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(digestInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    sn0.b.a(fileInputStream, th4);
                    throw th5;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getMD5HashOfFileContent$lambda$3$lambda$2$lambda$1(byte b11) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
        s.j(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMD5HashOfFilePath(URI uri) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        String string = uri.toString();
        s.j(string, "toString(...)");
        byte[] bytes = string.getBytes(d.UTF_8);
        s.j(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        s.j(bArrDigest, "digest(...)");
        return n.P0(bArrDigest, "", null, null, 0, null, new l() { // from class: expo.modules.asset.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return AssetModule.getMD5HashOfFilePath$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getMD5HashOfFilePath$lambda$0(byte b11) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
        s.j(str, "format(...)");
        return str;
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoAsset");
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = moduleDefinitionBuilder.AsyncFunction("downloadAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            co0.d dVarB = o0.b(URI.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(URI.class), false, new wn0.a<q>() { // from class: expo.modules.asset.AssetModule$definition$lambda$5$$inlined$Coroutine$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(URI.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), Boolean.TRUE));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.asset.AssetModule$definition$lambda$5$$inlined$Coroutine$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters);
            }
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.asset.AssetModule$definition$lambda$5$$inlined$Coroutine$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters);
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new AssetModule$definition$lambda$5$$inlined$Coroutine$4(null, this)));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
