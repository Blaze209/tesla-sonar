package wo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lwo0/h;", "Luo0/e;", "Luo0/c;", "Lkotlinx/serialization/json/JsonElement;", "y", "()Lkotlinx/serialization/json/JsonElement;", "Lwo0/b;", DateTokenConverter.CONVERTER_KEY, "()Lwo0/b;", "json", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface h extends uo0.e, uo0.c {
    /* JADX INFO: renamed from: d */
    b getJson();

    JsonElement y();
}
