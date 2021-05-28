package cn.xdevops.springbootuprunning.sburplanefinder;

import org.springframework.data.repository.CrudRepository;

public interface PlaneRepository extends CrudRepository<Aircraft, String> {
}
