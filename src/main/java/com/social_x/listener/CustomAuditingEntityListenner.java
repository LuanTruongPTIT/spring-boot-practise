package com.social_x.listener;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.AuditingHandler;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.social_x.model.AbstractAuditEntity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Configuration()
public class CustomAuditingEntityListenner extends AuditingEntityListener {
  public CustomAuditingEntityListenner(ObjectFactory<AuditingHandler> handler) {
    super.setAuditingHandler(handler);
  }

  @Override
  @PrePersist
  public void touchForCreate(Object target) {
    AbstractAuditEntity entity = (AbstractAuditEntity) target;
    if (entity.getCreatedBy() == null) {
      super.touchForCreate(target);
    } else {
      if (entity.getLastModifiedBy() == null) {
        entity.setLastModifiedBy(entity.getCreatedBy());
      }
    }
  }

  @Override
  @PreUpdate
  public void touchForUpdate(Object target) {
    AbstractAuditEntity entity = (AbstractAuditEntity) target;
    if (entity.getLastModifiedBy() == null) {
      super.touchForUpdate(target);
    }
  }
}
