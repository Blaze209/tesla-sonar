package expo.modules.kotlin.types;

import co0.q;
import expo.modules.kotlin.exception.MissingTypeConverter;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/types/MergedTypeConverterProvider;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "", "providers", "<init>", "(Ljava/util/List;)V", "Lco0/q;", "type", "Lexpo/modules/kotlin/types/TypeConverter;", "obtainTypeConverter", "(Lco0/q;)Lexpo/modules/kotlin/types/TypeConverter;", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MergedTypeConverterProvider implements TypeConverterProvider {
    private final List<TypeConverterProvider> providers;

    /* JADX WARN: Multi-variable type inference failed */
    public MergedTypeConverterProvider(List<? extends TypeConverterProvider> providers) {
        s.k(providers, "providers");
        this.providers = providers;
    }

    @Override // expo.modules.kotlin.types.TypeConverterProvider
    public TypeConverter<?> obtainTypeConverter(q type) throws MissingTypeConverter {
        s.k(type, "type");
        Iterator<TypeConverterProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            try {
                return it.next().obtainTypeConverter(type);
            } catch (MissingTypeConverter unused) {
            }
        }
        throw new MissingTypeConverter(type);
    }
}
