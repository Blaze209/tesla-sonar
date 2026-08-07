package expo.modules.kotlin.types;

import android.net.Uri;
import android.os.Bundle;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.typedarray.RawTypedArrayHolder;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\n\"\u0006\b\u0000\u0010\t\u0018\u0001H\u0080\b¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/types/ReturnType;", "", "Lco0/d;", "klass", "<init>", "(Lco0/d;)V", "value", "convertToJS", "(Ljava/lang/Object;)Ljava/lang/Object;", "T", "", "inheritFrom$expo_modules_core_release", "()Z", "inheritFrom", "Lco0/d;", "Lexpo/modules/kotlin/types/ExperimentalJSTypeConverter;", "converter", "Lexpo/modules/kotlin/types/ExperimentalJSTypeConverter;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReturnType {
    private final ExperimentalJSTypeConverter<?> converter;
    private final co0.d<?> klass;

    public ReturnType(co0.d<?> klass) {
        s.k(klass, "klass");
        this.klass = klass;
        ExperimentalJSTypeConverter<?> passThroughConverter = s.f(klass, o0.b(h0.class)) ? new ExperimentalJSTypeConverter.PassThroughConverter() : s.f(klass, o0.b(Bundle.class)) ? new ExperimentalJSTypeConverter.BundleConverter() : s.f(klass, o0.b(int[].class)) ? new ExperimentalJSTypeConverter.IntArrayConverter() : s.f(klass, o0.b(float[].class)) ? new ExperimentalJSTypeConverter.FloatArrayConverter() : s.f(klass, o0.b(double[].class)) ? new ExperimentalJSTypeConverter.DoubleArrayConverter() : s.f(klass, o0.b(boolean[].class)) ? new ExperimentalJSTypeConverter.BooleanArrayConverter() : s.f(klass, o0.b(byte[].class)) ? new ExperimentalJSTypeConverter.ByteArrayConverter() : s.f(klass, o0.b(URI.class)) ? new ExperimentalJSTypeConverter.URIConverter() : s.f(klass, o0.b(URL.class)) ? new ExperimentalJSTypeConverter.URLConverter() : s.f(klass, o0.b(Uri.class)) ? new ExperimentalJSTypeConverter.AndroidUriConverter() : s.f(klass, o0.b(File.class)) ? new ExperimentalJSTypeConverter.FileConverter() : s.f(klass, o0.b(Pair.class)) ? new ExperimentalJSTypeConverter.PairConverter() : s.f(klass, o0.b(Long.TYPE)) ? new ExperimentalJSTypeConverter.LongConverter() : s.f(klass, o0.b(io0.b.class)) ? new ExperimentalJSTypeConverter.DurationConverter() : s.f(klass, o0.b(Object.class)) ? new ExperimentalJSTypeConverter.AnyConverter() : null;
        this.converter = passThroughConverter == null ? Map.class.isAssignableFrom(vn0.a.b(this.klass)) ? new ExperimentalJSTypeConverter.MapConverter() : Enum.class.isAssignableFrom(vn0.a.b(this.klass)) ? new ExperimentalJSTypeConverter.EnumConverter() : Record.class.isAssignableFrom(vn0.a.b(this.klass)) ? new ExperimentalJSTypeConverter.RecordConverter() : RawTypedArrayHolder.class.isAssignableFrom(vn0.a.b(this.klass)) ? new ExperimentalJSTypeConverter.RawTypedArrayHolderConverter() : Object[].class.isAssignableFrom(vn0.a.b(this.klass)) ? new ExperimentalJSTypeConverter.ArrayConverter() : Collection.class.isAssignableFrom(vn0.a.b(this.klass)) ? new ExperimentalJSTypeConverter.CollectionConverter() : new ExperimentalJSTypeConverter.PassThroughConverter() : passThroughConverter;
    }

    public final Object convertToJS(Object value) {
        return this.converter.convertToJS(value);
    }

    public final /* synthetic */ <T> boolean inheritFrom$expo_modules_core_release() {
        Class clsB = vn0.a.b(this.klass);
        s.q(4, "T");
        return Object.class.isAssignableFrom(clsB);
    }
}
