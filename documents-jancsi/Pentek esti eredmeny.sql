select
  k_cfg.description
  , k_test_case.name
  , k_test_case.description
  , id
  , k_test_case.version as testcase_version
  , k_tc_step_frag.version as frag_version
  , action, k_tc_step.pre_condition
  , k_tc_step.post_condition
from
    k_tc_step, k_tc_step_frag, k_rel_tc_frag, k_test_case, k_cfg
where
  k_tc_step.kl__id = k_tc_step_frag.kl__id
  and
  k_tc_step_frag.kl__id = k_rel_tc_frag.FRAGMENT
  and
  k_rel_tc_frag.testcase = k_test_case.kl__id
  and
  k_test_case.config = k_cfg.kl__id
order by
  k_cfg.name, k_test_case.name, id, testcase_version, frag_version;