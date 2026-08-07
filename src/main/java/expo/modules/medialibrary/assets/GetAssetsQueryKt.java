package expo.modules.medialibrary.assets;

import ch.qos.logback.core.joran.action.Action;
import expo.modules.medialibrary.AssetsOptions;
import expo.modules.medialibrary.MediaType;
import expo.modules.medialibrary.SortBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005\u001a\u0014\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¨\u0006\u000e"}, d2 = {"getQueryFromOptions", "Lexpo/modules/medialibrary/assets/GetAssetsQuery;", "input", "Lexpo/modules/medialibrary/AssetsOptions;", "createSelectionString", "", "parseMediaType", "", "mediaTypeName", "parseSortByKey", Action.KEY_ATTRIBUTE, "convertOrderDescriptors", "orderDescriptor", "", "expo-media-library_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GetAssetsQueryKt {
    public static final String convertOrderDescriptors(List<String> orderDescriptor) {
        s.k(orderDescriptor, "orderDescriptor");
        ArrayList arrayList = new ArrayList(20);
        Iterator<String> it = orderDescriptor.iterator();
        while (it.hasNext()) {
            List listF1 = t.f1(it.next(), new String[]{" "}, false, 0, 6, null);
            if (listF1.size() != 2) {
                throw new IllegalArgumentException("Array sortBy in assetsOptions has invalid layout.");
            }
            arrayList.add(parseSortByKey((String) listF1.get(0)) + " " + ((String) listF1.get(1)));
        }
        return v.y0(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    private static final String createSelectionString(AssetsOptions assetsOptions) {
        StringBuilder sb2 = new StringBuilder();
        if (assetsOptions.getAlbum() != null) {
            sb2.append("bucket_id = " + assetsOptions.getAlbum());
            sb2.append(" AND ");
        }
        List<String> mediaType = assetsOptions.getMediaType();
        if (mediaType.isEmpty() || mediaType.contains(MediaType.ALL.getApiName())) {
            sb2.append("media_type != 0");
        } else {
            List<String> list = mediaType;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(parseMediaType((String) it.next())));
            }
            sb2.append("media_type IN (" + v.y0(arrayList, ",", null, null, 0, null, null, 62, null) + ")");
        }
        Double createdAfter = assetsOptions.getCreatedAfter();
        if (createdAfter != null) {
            sb2.append(" AND datetaken > " + ((long) createdAfter.doubleValue()));
        }
        Double createdBefore = assetsOptions.getCreatedBefore();
        if (createdBefore != null) {
            sb2.append(" AND datetaken < " + ((long) createdBefore.doubleValue()));
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    public static final GetAssetsQuery getQueryFromOptions(AssetsOptions input) {
        Object objB;
        int iIntValue;
        s.k(input, "input");
        double first = input.getFirst();
        String after = input.getAfter();
        if (after != null) {
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(Integer.valueOf(Integer.parseInt(after)));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            if (jn0.s.g(objB)) {
                objB = null;
            }
            Integer num = (Integer) objB;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        return new GetAssetsQuery(createSelectionString(input), !input.getSortBy().isEmpty() ? convertOrderDescriptors(input.getSortBy()) : "bucket_display_name", first, iIntValue);
    }

    private static final int parseMediaType(String str) {
        MediaType mediaTypeFromApiName = MediaType.INSTANCE.fromApiName(str);
        Integer mediaColumn = mediaTypeFromApiName != null ? mediaTypeFromApiName.getMediaColumn() : null;
        if (mediaColumn != null) {
            return mediaColumn.intValue();
        }
        throw new IllegalArgumentException("MediaType " + str + " is not supported!");
    }

    public static final String parseSortByKey(String key) {
        s.k(key, "key");
        SortBy sortByFromKeyName = SortBy.INSTANCE.fromKeyName(key);
        String mediaColumnName = sortByFromKeyName != null ? sortByFromKeyName.getMediaColumnName() : null;
        if (mediaColumnName != null) {
            return mediaColumnName;
        }
        throw new IllegalArgumentException("SortBy key " + key + " is not supported!");
    }
}
