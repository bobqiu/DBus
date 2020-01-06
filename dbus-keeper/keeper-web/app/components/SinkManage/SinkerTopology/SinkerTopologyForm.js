/**
 * @author 戎晓伟
 * @description  基本信息设置
 */

import React, {Component} from 'react'
import {Form, Input, message, Modal, Select} from 'antd'
import {FormattedMessage} from 'react-intl'
import {intlMessage} from '@/app/i18n'
// 导入样式
import {CREATE_SINKER_TOPOLOGY_API, UPDATE_SINKER_TOPOLOGY_API} from '@/app/containers/SinkManage/api'
import Request from '@/app/utils/request'

const FormItem = Form.Item
const Option = Select.Option
@Form.create({warppedComponentRef: true})
export default class SinkerTopologyForm extends Component {
  constructor (props) {
    super(props)
    this.formItemLayout = {
      labelCol: {span: 4},
      wrapperCol: {span: 18}
    }
  }

  /**
   * @deprecated 提交数据
   */
  handleSubmit = () => {
    const {
      sinkerInfo,
      modalStatus,
      onSearch,
      onCloseModal,
      sinkerParams,
      jarList
    } = this.props
    const requestAPI =
      modalStatus === 'create' ? CREATE_SINKER_TOPOLOGY_API : UPDATE_SINKER_TOPOLOGY_API
    this.props.form.validateFieldsAndScroll((err, values) => {
      jarList.map(item => {
        if (item.id === values.jarPath) {
          values = {...values, jarId: item.id}
        }
      })
      if (!err) {
        const param =
          modalStatus === 'create'
            ? {
              ...values
            }
            : {...sinkerInfo, ...values, updateTime: undefined}
        this.setState({loading: true})
        Request(requestAPI, {
          data: {
            ...param
          },
          method: 'post'
        })
          .then(res => {
            if (res && res.status === 0) {
              onCloseModal(false)
              onSearch(sinkerParams)
            } else {
              message.warn(res.message)
            }
            this.setState({loading: false})
          })
          .catch(error => {
            error.response && error.response.data && error.response.data.message
              ? message.error(error.response.data.message)
              : message.error(error.message)
            this.setState({loading: false})
          })
      }
    })
  }
  /**
   * @deprecated input placeholder
   */
  handlePlaceholder = fun => id =>
    fun({
      id: 'app.components.input.placeholder',
      valus: {
        name: fun({id})
      }
    })

  render () {
    const {getFieldDecorator} = this.props.form
    const {modalKey, visible, onCloseModal, sinkerInfo, modalStatus, jarList} = this.props
    const localeMessage = intlMessage(this.props.locale, this.formMessage)
    const placeholder = this.handlePlaceholder(localeMessage)
    return (
      <Modal
        key={modalKey}
        visible={visible}
        maskClosable={false}
        width={'800px'}
        style={{top: 60}}
        onCancel={() => onCloseModal(false)}
        onOk={this.handleSubmit}
        confirmLoading={false}
        title={modalStatus === 'modify' ? <FormattedMessage
          id="app.components.sinkManage.modifySink"
          defaultMessage="修改Sinker"
        /> : <FormattedMessage
          id="app.components.sinkManage.addSink"
          defaultMessage="添加Sinker"
        />}
      >
        <Form autoComplete="off" layout="horizontal">
          {modalStatus === 'modify' && (<FormItem
            label={
              <FormattedMessage
                id="app.components.sinkManage.sinkerTopo.id"
                defaultMessage="id"
              />
            }
            {...this.formItemLayout}
          >
            {getFieldDecorator('id', {
              initialValue: sinkerInfo && sinkerInfo.id,
              rules: [
                {
                  required: false,
                  message: '请输入描述'
                }
              ]
            })(<Input disabled={true} placeholder={placeholder('app.components.sinkManage.sinkerTopo.id')}/>)}
          </FormItem>)
          }
          <FormItem
            label={
              <FormattedMessage
                id="app.components.sinkManage.sinkerTopo.sinkerName"
                defaultMessage="sinker名称"
              />
            }
            {...this.formItemLayout}
          >
            {getFieldDecorator('sinkerName', {
              initialValue: sinkerInfo && sinkerInfo.sinkerName,
              rules: [
                {
                  required: true,
                  message: '请输入名称'
                }
              ]
            })(
              <Input
                type="text"
                placeholder={'名称'}
                onBlur={this.handleBlur}
              />
            )}
          </FormItem>
          <FormItem label={<FormattedMessage id="app.components.projectManage.projectTopology.table.jarName"
                                             defaultMessage="Jar包"/>} {...this.formItemLayout}>
            {getFieldDecorator('jarPath', {
              initialValue: (sinkerInfo && sinkerInfo.jarPath),
              rules: [
                {
                  required: true,
                  message: '请选择jar包'
                }
              ]
            })(
              <Select
                showSearch
                optionFilterProp='children'
              >
                {jarList.map(item => (
                  <Option value={item.id} key={item.id}>
                    {item.path}
                  </Option>
                ))}
              </Select>
            )}
          </FormItem>
          <FormItem
            label={
              <FormattedMessage
                id="app.common.description"
                defaultMessage="描述"
              />
            }
            {...this.formItemLayout}
          >
            {getFieldDecorator('description', {
              initialValue: sinkerInfo && sinkerInfo.description,
              rules: [
                {
                  required: false,
                  message: '请输入描述'
                }
              ]
            })(<Input placeholder={placeholder('app.common.description')}/>)}
          </FormItem>
        </Form>
      </Modal>
    )
  }
}

SinkerTopologyForm.propTypes = {}
