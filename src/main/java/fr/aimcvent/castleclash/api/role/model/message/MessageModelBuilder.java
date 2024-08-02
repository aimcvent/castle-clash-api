package fr.aimcvent.castleclash.api.role.model.message;

import fr.aimcvent.castleclash.api.role.model.RoleModel;

import java.util.Map;

public interface MessageModelBuilder {

    MessageModelBuilder role(RoleModel roleModel);

    MessageModelBuilder parameter(Map<String, Object> parameterMap);

    MessageModel build();
}
