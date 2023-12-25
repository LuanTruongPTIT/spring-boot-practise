package com.social_x.model;

import java.time.ZonedDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import com.social_x.listener.CustomAuditingEntityListenner;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(CustomAuditingEntityListenner.class)
public class AbstractAuditEntity {
  @CreationTimestamp
  private ZonedDateTime createdOn;

  @CreatedBy
  private String createdBy;

  @UpdateTimestamp
  private ZonedDateTime lastModifiedOn;

  @LastModifiedBy
  private String lastModifiedBy;
}
