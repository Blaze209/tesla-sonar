package expo.modules.crypto;

import android.util.Base64;
import co0.q;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
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
import expo.modules.kotlin.typedarray.TypedArray;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;
import jn0.h0;
import jn0.m;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.d;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/crypto/CryptoModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "", "randomByteCount", "", "getRandomBase64String", "(I)Ljava/lang/String;", "Lexpo/modules/crypto/DigestAlgorithm;", "algorithm", "data", "Lexpo/modules/crypto/DigestOptions;", "options", "digestString", "(Lexpo/modules/crypto/DigestAlgorithm;Ljava/lang/String;Lexpo/modules/crypto/DigestOptions;)Ljava/lang/String;", "Lexpo/modules/kotlin/typedarray/TypedArray;", "output", "Ljn0/h0;", CMSAttributeTableGenerator.DIGEST, "(Lexpo/modules/crypto/DigestAlgorithm;Lexpo/modules/kotlin/typedarray/TypedArray;Lexpo/modules/kotlin/typedarray/TypedArray;)V", "typedArray", "getRandomValues", "(Lexpo/modules/kotlin/typedarray/TypedArray;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Ljava/security/SecureRandom;", "secureRandom$delegate", "Lkotlin/Lazy;", "getSecureRandom", "()Ljava/security/SecureRandom;", "secureRandom", "expo-crypto_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CryptoModule extends Module {

    /* JADX INFO: renamed from: secureRandom$delegate, reason: from kotlin metadata */
    private final Lazy secureRandom = m.b(new wn0.a() { // from class: expo.modules.crypto.b
        @Override // wn0.a
        public final Object invoke() {
            return CryptoModule.secureRandom_delegate$lambda$0();
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DigestOptions.Encoding.values().length];
            try {
                iArr[DigestOptions.Encoding.BASE64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DigestOptions.Encoding.HEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void digest(DigestAlgorithm algorithm, TypedArray output, TypedArray data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm.getValue());
        messageDigest.update(data.toDirectBuffer());
        byte[] bArrDigest = messageDigest.digest();
        s.j(bArrDigest, "digest(...)");
        output.write(bArrDigest, output.getByteOffset(), output.getByteLength());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String digestString(DigestAlgorithm algorithm, String data, DigestOptions options) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm.getValue());
        byte[] bytes = data.getBytes(d.UTF_8);
        s.j(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        s.j(bArrDigest, "digest(...)");
        int i11 = WhenMappings.$EnumSwitchMapping$0[options.getEncoding().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return n.P0(bArrDigest, "", null, null, 0, null, new l() { // from class: expo.modules.crypto.a
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return CryptoModule.digestString$lambda$9(((Byte) obj).byteValue());
                    }
                }, 30, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        s.h(strEncodeToString);
        return strEncodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence digestString$lambda$9(byte b11) {
        String string = Integer.toString((b11 & 255) + 256, p013kotlin.text.a.a(16));
        s.j(string, "toString(...)");
        String strSubstring = string.substring(1);
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRandomBase64String(int randomByteCount) {
        byte[] bArr = new byte[randomByteCount];
        getSecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        s.j(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getRandomValues(TypedArray typedArray) {
        byte[] bArr = new byte[typedArray.getByteLength()];
        getSecureRandom().nextBytes(bArr);
        typedArray.write(bArr, typedArray.getByteOffset(), typedArray.getByteLength());
    }

    private final SecureRandom getSecureRandom() {
        return (SecureRandom) this.secureRandom.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecureRandom secureRandom_delegate$lambda$0() {
        return new SecureRandom();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoCrypto");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            co0.d dVarB = o0.b(DigestAlgorithm.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(DigestAlgorithm.class), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(DigestAlgorithm.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r2), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(o0.b(DigestOptions.class), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(DigestOptions.class);
                    }
                }), converters);
            }
            AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(String.class));
            if (returnType == null) {
                returnType = new ReturnType(o0.b(String.class));
                returnTypeProvider.getTypes().put(o0.b(String.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("digestString", new SyncFunctionComponent("digestString", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$4
                @Override // wn0.l
                public final Object invoke(Object[] objArr) {
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    DigestOptions digestOptions = (DigestOptions) objArr[2];
                    DigestAlgorithm digestAlgorithm = (DigestAlgorithm) obj;
                    return this.$receiver$inlined.digestString(digestAlgorithm, (String) obj2, digestOptions);
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r6), bool));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(o0.b(DigestAlgorithm.class), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$AsyncFunction$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(DigestAlgorithm.class);
                    }
                }), converters2);
            }
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$AsyncFunction$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters2);
            }
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r2), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(o0.b(r2), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$AsyncFunction$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(DigestOptions.class);
                    }
                }), converters2);
            }
            AnyType[] anyTypeArr2 = {anyType4, anyType5, anyType6};
            l<Object[], String> lVar = new l<Object[], String>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$AsyncFunction$4
                @Override // wn0.l
                public final String invoke(Object[] objArr) {
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    DigestOptions digestOptions = (DigestOptions) objArr[2];
                    DigestAlgorithm digestAlgorithm = (DigestAlgorithm) obj;
                    return this.$receiver$inlined.digestString(digestAlgorithm, (String) obj2, digestOptions);
                }
            };
            Class cls = Integer.TYPE;
            boolean zF = s.f(String.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            if (zF) {
                stringAsyncFunctionComponent = new IntAsyncFunctionComponent("digestStringAsync", anyTypeArr2, lVar);
            } else if (s.f(String.class, cls4)) {
                stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("digestStringAsync", anyTypeArr2, lVar);
            } else if (s.f(String.class, cls3)) {
                stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("digestStringAsync", anyTypeArr2, lVar);
            } else if (s.f(String.class, cls2)) {
                stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("digestStringAsync", anyTypeArr2, lVar);
            } else {
                stringAsyncFunctionComponent = s.f(String.class, String.class) ? new StringAsyncFunctionComponent("digestStringAsync", anyTypeArr2, lVar) : new UntypedAsyncFunctionComponent("digestStringAsync", anyTypeArr2, lVar);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("digestStringAsync", stringAsyncFunctionComponent);
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Integer.class), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(o0.b(Integer.class), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Integer.TYPE);
                    }
                }), converters3);
            }
            AnyType[] anyTypeArr3 = {anyType7};
            ReturnType returnType2 = returnTypeProvider.getTypes().get(o0.b(String.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(o0.b(String.class));
                returnTypeProvider.getTypes().put(o0.b(String.class), returnType2);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getRandomBase64String", new SyncFunctionComponent("getRandomBase64String", anyTypeArr3, returnType2, new l<Object[], Object>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$6
                @Override // wn0.l
                public final Object invoke(Object[] objArr) {
                    s.k(objArr, "<destruct>");
                    return this.$receiver$inlined.getRandomBase64String(((Number) objArr[0]).intValue());
                }
            }));
            if (s.f(Integer.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("getRandomBase64StringAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$AsyncFunction$5
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        this.$receiver$inlined.getRandomBase64String(((Integer) promise).intValue());
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
            } else {
                TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
                AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Integer.class), bool));
                if (anyType8 == null) {
                    anyType8 = new AnyType(new LazyKType(o0.b(Integer.class), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$AsyncFunction$6
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Integer.TYPE);
                        }
                    }), converters4);
                }
                AnyType[] anyTypeArr4 = {anyType8};
                l<Object[], String> lVar2 = new l<Object[], String>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$AsyncFunction$7
                    @Override // wn0.l
                    public final String invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        return this.$receiver$inlined.getRandomBase64String(((Number) objArr[0]).intValue());
                    }
                };
                if (s.f(String.class, cls)) {
                    stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("getRandomBase64StringAsync", anyTypeArr4, lVar2);
                } else if (s.f(String.class, cls4)) {
                    stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("getRandomBase64StringAsync", anyTypeArr4, lVar2);
                } else if (s.f(String.class, cls3)) {
                    stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("getRandomBase64StringAsync", anyTypeArr4, lVar2);
                } else if (s.f(String.class, cls2)) {
                    stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("getRandomBase64StringAsync", anyTypeArr4, lVar2);
                } else {
                    stringAsyncFunctionComponent2 = s.f(String.class, String.class) ? new StringAsyncFunctionComponent("getRandomBase64StringAsync", anyTypeArr4, lVar2) : new UntypedAsyncFunctionComponent("getRandomBase64StringAsync", anyTypeArr4, lVar2);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getRandomBase64StringAsync", asyncFunctionWithPromiseComponent);
            TypeConverterProvider converters5 = moduleDefinitionBuilder.getConverters();
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r5), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(o0.b(TypedArray.class), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(TypedArray.class);
                    }
                }), converters5);
            }
            AnyType[] anyTypeArr5 = {anyType9};
            ReturnType returnType3 = returnTypeProvider.getTypes().get(o0.b(r4));
            if (returnType3 == null) {
                returnType3 = new ReturnType(o0.b(r4));
                returnTypeProvider.getTypes().put(o0.b(h0.class), returnType3);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getRandomValues", new SyncFunctionComponent("getRandomValues", anyTypeArr5, returnType3, new l<Object[], Object>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$8
                @Override // wn0.l
                public final Object invoke(Object[] objArr) {
                    s.k(objArr, "<destruct>");
                    this.$receiver$inlined.getRandomValues((TypedArray) objArr[0]);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters6 = moduleDefinitionBuilder.getConverters();
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r6), bool));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(o0.b(r6), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$9
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(DigestAlgorithm.class);
                    }
                }), converters6);
            }
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r5), bool));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(o0.b(r5), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$10
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(TypedArray.class);
                    }
                }), converters6);
            }
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r5), bool));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(o0.b(r5), false, new wn0.a<q>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$11
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(TypedArray.class);
                    }
                }), converters6);
            }
            AnyType[] anyTypeArr6 = {anyType10, anyType11, anyType12};
            ReturnType returnType4 = returnTypeProvider.getTypes().get(o0.b(r4));
            if (returnType4 == null) {
                returnType4 = new ReturnType(o0.b(r4));
                returnTypeProvider.getTypes().put(o0.b(r4), returnType4);
            }
            moduleDefinitionBuilder.getSyncFunctions().put(CMSAttributeTableGenerator.DIGEST, new SyncFunctionComponent(CMSAttributeTableGenerator.DIGEST, anyTypeArr6, returnType4, new l<Object[], Object>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$Function$12
                @Override // wn0.l
                public final Object invoke(Object[] objArr) throws NoSuchAlgorithmException {
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    TypedArray typedArray = (TypedArray) objArr[2];
                    CryptoModule cryptoModule = this.$receiver$inlined;
                    cryptoModule.digest((DigestAlgorithm) obj, (TypedArray) obj2, typedArray);
                    return h0.f84049a;
                }
            }));
            AnyType[] anyTypeArr7 = new AnyType[0];
            ReturnType returnType5 = returnTypeProvider.getTypes().get(o0.b(r0));
            if (returnType5 == null) {
                returnType5 = new ReturnType(o0.b(r0));
                returnTypeProvider.getTypes().put(o0.b(Object.class), returnType5);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("randomUUID", new SyncFunctionComponent("randomUUID", anyTypeArr7, returnType5, new l<Object[], Object>() { // from class: expo.modules.crypto.CryptoModule$definition$lambda$7$$inlined$FunctionWithoutArgs$1
                @Override // wn0.l
                public final Object invoke(Object[] it) {
                    s.k(it, "it");
                    return UUID.randomUUID().toString();
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
