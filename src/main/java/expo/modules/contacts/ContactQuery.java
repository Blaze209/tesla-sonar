package expo.modules.contacts;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\u0015R$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/contacts/ContactQuery;", "Lexpo/modules/kotlin/records/Record;", "<init>", "()V", "pageSize", "", "getPageSize$annotations", "getPageSize", "()I", "pageOffset", "getPageOffset$annotations", "getPageOffset", "fields", "", "", "getFields$annotations", "getFields", "()Ljava/util/Set;", "sort", "getSort$annotations", "getSort", "()Ljava/lang/String;", "name", "getName$annotations", "getName", "id", "", "getId$annotations", "getId", "()Ljava/util/List;", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContactQuery implements Record {
    private final Set<String> fields = ContactsModuleKt.defaultFields;
    private final List<String> id;
    private final String name;
    private final int pageOffset;
    private final int pageSize;
    private final String sort;

    @Field
    public static /* synthetic */ void getFields$annotations() {
    }

    @Field
    public static /* synthetic */ void getId$annotations() {
    }

    @Field
    public static /* synthetic */ void getName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPageOffset$annotations() {
    }

    @Field
    public static /* synthetic */ void getPageSize$annotations() {
    }

    @Field
    public static /* synthetic */ void getSort$annotations() {
    }

    public final Set<String> getFields() {
        return this.fields;
    }

    public final List<String> getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPageOffset() {
        return this.pageOffset;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final String getSort() {
        return this.sort;
    }
}
