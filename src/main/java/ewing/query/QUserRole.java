package ewing.query;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.sql.ColumnMetadata;
import ewing.entity.UserRole;

import javax.annotation.Generated;
import java.sql.Types;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QUserRole is a Querydsl query type for UserRole
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUserRole extends com.querydsl.sql.RelationalPathBase<UserRole> {

    private static final long serialVersionUID = -1251534674;

    public static final QUserRole userRole = new QUserRole("user_role");

    public final NumberPath<Integer> roleId = createNumber("roleId", Integer.class);

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public final com.querydsl.sql.PrimaryKey<UserRole> primary = createPrimaryKey(roleId, userId);

    public QUserRole(String variable) {
        super(UserRole.class, forVariable(variable), "null", "user_role");
        addMetadata();
    }

    public QUserRole(String variable, String schema, String table) {
        super(UserRole.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserRole(String variable, String schema) {
        super(UserRole.class, forVariable(variable), schema, "user_role");
        addMetadata();
    }

    public QUserRole(Path<? extends UserRole> path) {
        super(path.getType(), path.getMetadata(), "null", "user_role");
        addMetadata();
    }

    public QUserRole(PathMetadata metadata) {
        super(UserRole.class, metadata, "null", "user_role");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(roleId, ColumnMetadata.named("role_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

