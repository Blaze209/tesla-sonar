package expo.modules.contacts.models;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.contacts.Columns;
import expo.modules.contacts.CommonProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0014\u001a\u00020\t2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\t2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0004¢\u0006\u0004\b#\u0010\u000bR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001a\u0010/\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u00103\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0014\u00104\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010,R\u0011\u00108\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u00107R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b9\u0010,R\u0013\u0010;\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b:\u0010,R\u0013\u0010=\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b<\u0010,R\u0014\u0010A\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lexpo/modules/contacts/models/BaseModel;", "Lexpo/modules/contacts/CommonProvider;", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "", Action.KEY_ATTRIBUTE, "androidKey", "Ljn0/h0;", "putInt", "(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)V", AnnotatedPrivateKey.LABEL, "", "mapStringToType", "(Ljava/lang/String;)I", "", "", "readableMap", "alias", "mapValue", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "fromCursor", "(Landroid/database/Cursor;)V", "rawId", "Landroid/content/ContentProviderOperation;", "getInsertOperation", "(Ljava/lang/String;)Landroid/content/ContentProviderOperation;", "getDeleteOperation", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "fromMap", "(Ljava/util/Map;)V", "getLabelFromCursor", "(Landroid/database/Cursor;)Ljava/lang/String;", "putString", "Landroid/os/Bundle;", "map", "Landroid/os/Bundle;", "getMap", "()Landroid/os/Bundle;", "dataAlias", "Ljava/lang/String;", "getDataAlias", "()Ljava/lang/String;", "labelAlias", "getLabelAlias", "idAlias", "getIdAlias", "typeAlias", "getId", "id", "isPrimary", "()I", "isPrimaryAlias", "()Landroid/content/ContentProviderOperation;", "insertOperation", "getLabel", "getData", "data", "getType", "type", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "contentValues", "Companion", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseModel implements CommonProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Bundle map = new Bundle();
    private final String dataAlias = Columns.DATA;
    private final String labelAlias = AnnotatedPrivateKey.LABEL;
    private final String idAlias = "id";
    private final String typeAlias = "type";

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0018\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/contacts/models/BaseModel$Companion;", "", "<init>", "()V", "decodeList", "", "T", "Lexpo/modules/contacts/models/BaseModel;", "input", "", "", "", "clazz", "Ljava/lang/Class;", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends BaseModel> List<T> decodeList(List<? extends Map<String, ? extends Object>> input, Class<T> clazz) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            s.k(clazz, "clazz");
            if (input == null) {
                return null;
            }
            List<? extends Map<String, ? extends Object>> list = input;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            for (Map<String, ? extends Object> map : list) {
                T tNewInstance = clazz.getDeclaredConstructor(null).newInstance(null);
                tNewInstance.fromMap(map);
                arrayList.add(tNewInstance);
            }
            return v.p1(arrayList);
        }

        private Companion() {
        }
    }

    private final String getId() {
        return getString(getIdAlias());
    }

    private final int isPrimary() {
        return (this.map.containsKey(isPrimaryAlias()) && this.map.getBoolean(isPrimaryAlias())) ? 1 : 0;
    }

    private final String isPrimaryAlias() {
        return "isPrimary";
    }

    public static /* synthetic */ void mapValue$default(BaseModel baseModel, Map map, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mapValue");
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        baseModel.mapValue(map, str, str2);
    }

    private final void putInt(Cursor cursor, String key, String androidKey) {
        int columnIndex = cursor.getColumnIndex(androidKey);
        if (columnIndex == -1) {
            return;
        }
        this.map.putInt(key, cursor.getInt(columnIndex));
    }

    public void fromCursor(Cursor cursor) {
        s.k(cursor, "cursor");
        putString(cursor, getIdAlias(), Columns.ID);
        this.map.putString(getLabelAlias(), getLabelFromCursor(cursor));
        putString(cursor, getDataAlias(), Columns.DATA);
        putString(cursor, Columns.LABEL, Columns.LABEL);
        putString(cursor, this.typeAlias, Columns.TYPE);
        putInt(cursor, isPrimaryAlias(), Columns.IS_PRIMARY);
    }

    public void fromMap(Map<String, ? extends Object> readableMap) {
        s.k(readableMap, "readableMap");
        Iterator<String> it = readableMap.keySet().iterator();
        while (it.hasNext()) {
            mapValue$default(this, readableMap, it.next(), null, 4, null);
        }
    }

    public ContentValues getContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, getContentType());
        contentValues.put(Columns.DATA, getData());
        contentValues.put(Columns.TYPE, Integer.valueOf(mapStringToType(getLabel())));
        contentValues.put(Columns.LABEL, getLabel());
        contentValues.put(Columns.ID, getId());
        contentValues.put(Columns.IS_PRIMARY, Integer.valueOf(isPrimary()));
        return contentValues;
    }

    public final String getData() {
        return getString(getDataAlias());
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return this.dataAlias;
    }

    public final ContentProviderOperation getDeleteOperation(String rawId) {
        s.k(rawId, "rawId");
        ContentProviderOperation.Builder builderNewDelete = ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI);
        t0 t0Var = t0.f86535a;
        String str = String.format("%s=? AND %s=?", Arrays.copyOf(new Object[]{Columns.MIMETYPE, "raw_contact_id"}, 2));
        s.j(str, "format(...)");
        ContentProviderOperation contentProviderOperationBuild = builderNewDelete.withSelection(str, new String[]{getContentType(), rawId}).build();
        s.j(contentProviderOperationBuild, "build(...)");
        return contentProviderOperationBuild;
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getIdAlias() {
        return this.idAlias;
    }

    public final ContentProviderOperation getInsertOperation() {
        return getInsertOperation(null);
    }

    public final String getLabel() {
        return getString(getLabelAlias());
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getLabelAlias() {
        return this.labelAlias;
    }

    protected String getLabelFromCursor(Cursor cursor) {
        s.k(cursor, "cursor");
        if (cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE)) != 0) {
            return null;
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow(Columns.LABEL));
        return string == null ? "unknown" : string;
    }

    public final Bundle getMap() {
        return this.map;
    }

    public final String getString(String key) {
        if (this.map.containsKey(key)) {
            return this.map.getString(key);
        }
        return null;
    }

    public final String getType() {
        return getString(this.typeAlias);
    }

    public int mapStringToType(String label) {
        return 0;
    }

    protected final void mapValue(Map<String, ? extends Object> readableMap, String key, String alias) {
        s.k(readableMap, "readableMap");
        if (readableMap.containsKey(key)) {
            Object obj = readableMap.get(key);
            if (obj instanceof Boolean) {
                Bundle bundle = this.map;
                if (alias != null) {
                    key = alias;
                }
                bundle.putBoolean(key, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof String) {
                Bundle bundle2 = this.map;
                if (alias != null) {
                    key = alias;
                }
                bundle2.putString(key, (String) obj);
                return;
            }
            if (obj instanceof Double) {
                Bundle bundle3 = this.map;
                if (alias != null) {
                    key = alias;
                }
                bundle3.putDouble(key, ((Number) obj).doubleValue());
            }
        }
    }

    protected final void putString(Cursor cursor, String key, String androidKey) {
        s.k(cursor, "cursor");
        int columnIndex = cursor.getColumnIndex(androidKey);
        if (columnIndex == -1) {
            return;
        }
        String string = cursor.getString(columnIndex);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.map.putString(key, string);
    }

    public ContentProviderOperation getInsertOperation(String rawId) {
        ContentProviderOperation.Builder builderNewInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        s.j(builderNewInsert, "newInsert(...)");
        if (rawId == null) {
            builderNewInsert.withValueBackReference("raw_contact_id", 0);
        } else {
            builderNewInsert.withValue("raw_contact_id", rawId);
        }
        ContentProviderOperation contentProviderOperationBuild = builderNewInsert.withValue(Columns.MIMETYPE, getContentType()).withValue(Columns.TYPE, Integer.valueOf(mapStringToType(getLabel()))).withValue(Columns.DATA, getData()).withValue(Columns.ID, getId()).build();
        s.j(contentProviderOperationBuild, "build(...)");
        return contentProviderOperationBuild;
    }
}
